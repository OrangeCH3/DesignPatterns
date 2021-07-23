package pers.ditto.template;

/**
 * @author OrangeCH3
 * @create 2021-07-23 10:50
 */

@SuppressWarnings("all")
public class PureSoyaMilk extends SoyaMilk{

    @Override
    void addCondiments() {
        // 空实现，不加配料
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
