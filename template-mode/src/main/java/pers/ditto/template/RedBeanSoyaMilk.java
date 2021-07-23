package pers.ditto.template;

/**
 * @author OrangeCH3
 * @create 2021-07-23 10:48
 */

@SuppressWarnings("all")
public class RedBeanSoyaMilk extends SoyaMilk{

    @Override
    void addCondiments() {
        System.out.println("制作前准备：选择上好的红豆配料");
    }
}
