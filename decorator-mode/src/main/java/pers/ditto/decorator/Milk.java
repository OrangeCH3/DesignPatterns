package pers.ditto.decorator;

/**
 * @author OrangeCH3
 * @create 2021-07-19 10:47
 */

@SuppressWarnings("all")
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}
