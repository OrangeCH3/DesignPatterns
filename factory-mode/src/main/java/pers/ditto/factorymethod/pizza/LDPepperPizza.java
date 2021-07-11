package pers.ditto.factorymethod.pizza;

/**
 * @author OrangeCH3
 * @create 2021-07-11 12:46
 */

@SuppressWarnings("all")
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {

        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza 准备原材料");
    }
}

