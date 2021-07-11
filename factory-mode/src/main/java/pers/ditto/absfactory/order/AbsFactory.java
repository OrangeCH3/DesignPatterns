package pers.ditto.absfactory.order;

import pers.ditto.absfactory.pizza.Pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 13:20
 */

@SuppressWarnings("all")
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}

