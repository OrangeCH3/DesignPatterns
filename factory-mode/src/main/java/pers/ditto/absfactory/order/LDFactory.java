package pers.ditto.absfactory.order;

import pers.ditto.absfactory.pizza.LDCheesePizza;
import pers.ditto.absfactory.pizza.LDPepperPizza;
import pers.ditto.absfactory.pizza.Pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 13:23
 */

@SuppressWarnings("all")
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
