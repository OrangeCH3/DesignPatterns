package pers.ditto.observer;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-29 10:21
 */

@SuppressWarnings("all")
public class ClientObserver {

    @Test
    public void testObserver() {

        //创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        //注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        //测试
        System.out.println("定时给已注册的观察者推送天气信息");
        weatherData.setData(10f, 100f, 30.3f);


        weatherData.removeObserver(currentConditions);
        //测试
        System.out.println();
        System.out.println("定时给已注册的观察者推送天气信息");
        weatherData.setData(10f, 100f, 30.3f);
    }
}
