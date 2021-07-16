package pers.ditto.classadapter;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:05
 */

@SuppressWarnings("all")
public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电");
        }
    }
}
