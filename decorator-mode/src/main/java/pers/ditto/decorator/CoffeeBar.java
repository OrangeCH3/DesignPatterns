package pers.ditto.decorator;

/**
 * @author OrangeCH3
 * @create 2021-07-19 10:48
 */

@SuppressWarnings("all")
public class CoffeeBar {

    public static void main(String[] args) {
        // 1. 点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("点一份 LongBlack：");
        System.out.println("费用=" + order.cost());
        System.out.println("描述=" + order.getDes());
        System.out.println();

        // 2. order 加入一份牛奶
        order = new Milk(order);

        System.out.println("Order 加入一份牛奶：");
        System.out.println("费用 =" + order.cost());
        System.out.println("描述 = " + order.getDes());
        System.out.println();

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("Order 再加入一份巧克力：");
        System.out.println("费用 =" + order.cost());
        System.out.println("描述 = " + order.getDes());
        System.out.println();

        // 3. order 加入一份巧克力

        order = new Chocolate(order);

        System.out.println("Order 再再加入一份巧克力：");
        System.out.println("费用 =" + order.cost());
        System.out.println("描述 = " + order.getDes());
        System.out.println();

        Drink order2 = new DeCaf();

        System.out.println("点一份无因咖啡：");
        System.out.println("费用 =" + order2.cost());
        System.out.println("描述 = " + order2.getDes());
        System.out.println();

        order2 = new Milk(order2);

        System.out.println("Order 加入一份牛奶：");
        System.out.println("费用 =" + order2.cost());
        System.out.println("描述 = " + order2.getDes());

    }
}
