package pers.ditto.bridge;

/**
 * @author OrangeCH3
 * @create 2021-07-17 9:57
 */

@SuppressWarnings("all")
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println(" 小米手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" 小米手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" 小米手机打电话 ");
    }
}
