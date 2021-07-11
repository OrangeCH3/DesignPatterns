package pers.ditto.absfactory.order;

/**
 * @author OrangeCH3
 * @create 2021-07-11 13:25
 */

@SuppressWarnings("all")
public class PizzaStore {

    public static void main(String[] args) {

        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
