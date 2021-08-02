package pers.ditto.strategy;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:25
 */

@SuppressWarnings("all")
public class PekingDuck extends Duck{

    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();

    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
