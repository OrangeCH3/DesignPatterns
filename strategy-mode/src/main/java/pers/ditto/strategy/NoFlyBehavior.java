package pers.ditto.strategy;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:23
 */

@SuppressWarnings("all")
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
