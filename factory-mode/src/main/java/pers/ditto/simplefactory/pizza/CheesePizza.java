package pers.ditto.simplefactory.pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:35
 */

@SuppressWarnings("all")
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {

        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }

}
