package pers.ditto.decorator;

/**
 * @author OrangeCH3
 * @create 2021-07-19 10:39
 */

@SuppressWarnings("all")
public class Coffee extends Drink{

    @Override
    public float cost() {
        return getPrice();
    }
}
