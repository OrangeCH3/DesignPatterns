package pers.ditto.strategy;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:27
 */

@SuppressWarnings("all")
public class WildDuck extends Duck{

    //构造器，传入FlyBehavor 的对象
    public  WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
