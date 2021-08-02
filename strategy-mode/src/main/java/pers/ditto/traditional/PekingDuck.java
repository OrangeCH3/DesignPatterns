package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:07
 */

@SuppressWarnings("all")
public class PekingDuck extends Duck{

    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
