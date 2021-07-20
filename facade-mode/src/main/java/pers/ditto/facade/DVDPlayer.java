package pers.ditto.facade;

/**
 * @author OrangeCH3
 * @create 2021-07-20 16:56
 */

@SuppressWarnings("all")
public class DVDPlayer {

    //使用单例模式, 使用饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstanc() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }
    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

    public void pause() {
        System.out.println(" dvd pause ");
    }
}
