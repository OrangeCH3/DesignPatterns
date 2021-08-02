package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-08-01 19:06
 */

@SuppressWarnings("all")
public abstract class Duck {

    public Duck() {

    }

    public abstract void display(); //显示鸭子信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim() {
        System.out.println("鸭子会游泳");
    }

    public void fly() {
        System.out.println("鸭子会飞翔");
    }
}
