package pers.ditto.facade;

/**
 * @author OrangeCH3
 * @create 2021-07-20 16:55
 */

@SuppressWarnings("all")
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
