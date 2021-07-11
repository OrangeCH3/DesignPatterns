package pers.ditto.absfactory.pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:46
 */

@SuppressWarnings("all")
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {

        setName("伦敦的奶酪pizza");
        System.out.println("伦敦的奶酪pizza 准备原材料");
    }
}

