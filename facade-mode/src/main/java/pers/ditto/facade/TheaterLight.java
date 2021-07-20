package pers.ditto.facade;

/**
 * @author OrangeCH3
 * @create 2021-07-20 16:52
 */

@SuppressWarnings("all")
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright ");
    }
}
