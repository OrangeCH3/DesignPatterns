# Observer Mode

> 天气预报项目需求

1. 气象站可以将每天测量到的温度，湿度，气压等等以公告的形式发布出去(比如发布到自己的网站或第三方)
2. 需要设计开放型 API，便于其他第三方也能接入气象站获取数据
3. 提供温度、气压和湿度的接口
4. 测量数据更新时，要能实时的通知给第三方

---

> 传统方案解决天气预报项目

方案设计：

![传统方案解决天气预报项目](./PictureMaterial/传统方案解决天气预报项目.png)

代码实现：

```java
package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-07-29 10:00
 */

@SuppressWarnings("all")
public class CurrentConditions {

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("Today → Temperature: " + temperature);
        System.out.println("Today → Pressure: " + pressure);
        System.out.println("Today → Humidity: " + humidity);
    }
}
```

```java
package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-07-29 10:01
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 CurrentConditions 对象
 * 3. 当数据有更新时，就主动的调用 CurrentConditions对象update方法(含 display), 这样他们（接入方）就看到最新的信息
 */


@SuppressWarnings("all")
public class WeatherData {

    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    //加入新的第三方

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        //调用 接入方的 update
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    //当数据有更新时，就调用 setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }
}
```

```java
package pers.ditto.traditional;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-29 10:03
 */

@SuppressWarnings("all")
public class ClientTtad {

    @Test
    public void testTtad() {

        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        weatherData.setData(30, 150, 40);

        //天气情况变化
        System.out.println("定时接收网站信息变化中。。。");
        weatherData.setData(40, 160, 20);
    }
}
```









