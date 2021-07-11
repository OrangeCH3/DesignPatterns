package pers.ditto.factorymethod.pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:46
 */

@SuppressWarnings("all")
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        //
        setName("北京的奶酪pizza");
        System.out.println("北京的奶酪pizza 准备原材料");
    }

}
