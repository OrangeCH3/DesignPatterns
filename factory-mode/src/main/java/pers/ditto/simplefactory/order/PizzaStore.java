package pers.ditto.simplefactory.order;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:31
 */

//相当于一个客户端，发出订购
@SuppressWarnings("all")
public class PizzaStore {

    public static void main(String[] args) {

        //new OrderPizzac();

        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("~~退出程序~~");


    }

}

