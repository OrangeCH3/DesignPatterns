package pers.ditto.classadapter;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:04
 */


//适配器类
@SuppressWarnings("all")
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44 ; //转成 5v
        return dstV;
    }

}

