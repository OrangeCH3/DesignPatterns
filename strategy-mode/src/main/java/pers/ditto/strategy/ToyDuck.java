package pers.ditto.strategy;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:27
 */

@SuppressWarnings("all")
public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法

    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }
}
