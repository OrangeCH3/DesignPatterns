package pers.ditto.factorymethod.order;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:49
 */

@SuppressWarnings("all")
public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }

    }

}
