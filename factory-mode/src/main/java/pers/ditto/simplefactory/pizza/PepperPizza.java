package pers.ditto.simplefactory.pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:34
 */

@SuppressWarnings("all")
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {

        System.out.println(" 给胡椒披萨准备原材料 ");
    }

}

