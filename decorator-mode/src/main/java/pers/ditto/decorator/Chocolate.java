package pers.ditto.decorator;

/**
 * @author OrangeCH3
 * @create 2021-07-19 10:46
 */

@SuppressWarnings("all")
public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f);
    }
}
