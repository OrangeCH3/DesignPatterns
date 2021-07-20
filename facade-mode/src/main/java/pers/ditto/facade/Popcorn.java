package pers.ditto.facade;

/**
 * @author OrangeCH3
 * @create 2021-07-20 16:56
 */

@SuppressWarnings("all")
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }
}
