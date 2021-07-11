package pers.ditto.absfactory.order;

import pers.ditto.absfactory.pizza.BJCheesePizza;
import pers.ditto.absfactory.pizza.BJPepperPizza;
import pers.ditto.absfactory.pizza.Pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 13:22
 */


//这是工厂子类
@SuppressWarnings("all")
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
