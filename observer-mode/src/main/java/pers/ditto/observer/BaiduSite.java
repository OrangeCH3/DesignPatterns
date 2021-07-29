package pers.ditto.observer;

/**
 * @author OrangeCH3
 * @create 2021-07-29 10:18
 */

@SuppressWarnings("all")
public class BaiduSite implements Observer{

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println();
        System.out.println("Extended API(BaiDu) → Temperature: " + temperature + "(Observer Mode)");
        System.out.println("Extended API(BaiDu) → Pressure: " + pressure + "(Observer Mode)");
        System.out.println("Extended API(BaiDu) → Humidity: " + humidity + "(Observer Mode)");
    }
}
