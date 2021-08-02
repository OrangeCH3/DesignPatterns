package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:08
 */

@SuppressWarnings("all")
public class ToyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }
    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }
    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞翔");
    }
}
