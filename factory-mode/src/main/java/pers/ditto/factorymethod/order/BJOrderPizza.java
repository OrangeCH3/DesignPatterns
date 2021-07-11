package pers.ditto.factorymethod.order;

import pers.ditto.factorymethod.pizza.BJCheesePizza;
import pers.ditto.factorymethod.pizza.BJPepperPizza;
import pers.ditto.factorymethod.pizza.Pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:50
 */

@SuppressWarnings("all")
public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }

}

