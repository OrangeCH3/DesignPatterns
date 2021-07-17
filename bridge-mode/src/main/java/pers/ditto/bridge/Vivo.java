package pers.ditto.bridge;

/**
 * @author OrangeCH3
 * @create 2021-07-17 9:56
 */

@SuppressWarnings("all")
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机打电话 ");
    }
}
