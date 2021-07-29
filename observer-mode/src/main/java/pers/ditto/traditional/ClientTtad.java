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
