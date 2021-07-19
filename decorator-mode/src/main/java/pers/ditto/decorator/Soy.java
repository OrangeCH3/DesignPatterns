package pers.ditto.decorator;

/**
 * @author OrangeCH3
 * @create 2021-07-19 10:46
 */

@SuppressWarnings("all")
public class Soy extends Decorator{
     public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆 ");
        setPrice(1.5f);
    }
}
