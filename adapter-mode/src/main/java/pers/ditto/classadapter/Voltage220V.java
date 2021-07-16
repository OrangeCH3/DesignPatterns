package pers.ditto.classadapter;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:02
 */

@SuppressWarnings("all")
public class Voltage220V {

    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("适配前电压 = " + src + "伏");
        return src;
    }
}
