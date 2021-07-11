package pers.ditto.simplefactory.pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:34
 */

@SuppressWarnings("all")
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {

        System.out.println(" 给希腊披萨 准备原材料 ");
    }

}
