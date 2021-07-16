package pers.ditto.objectadapter;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:18
 */

//被适配的类
@SuppressWarnings("all")
public class Voltage220V {
    //输出220V的电压，不变
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
