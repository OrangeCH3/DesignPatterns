package pers.ditto.factorymethod.order;

import pers.ditto.factorymethod.pizza.LDCheesePizza;
import pers.ditto.factorymethod.pizza.LDPepperPizza;
import pers.ditto.factorymethod.pizza.Pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:50
 */

@SuppressWarnings("all")
public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }

}

