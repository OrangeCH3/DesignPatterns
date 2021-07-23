package pers.ditto.template;

/**
 * @author OrangeCH3
 * @create 2021-07-23 10:37
 */

@SuppressWarnings("all")
public abstract class SoyaMilk {

    //模板方法, make , 模板方法可以做成final , 不让子类去覆盖.
    final void make() {

        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
        System.out.println("制作完成啦");

    }

    //选材料
    void select() {
        System.out.println("制作前准备：选择上好的新鲜黄豆");
    }

    //添加不同的配料， 抽象方法, 子类具体实现
    abstract void addCondiments();

    //浸泡
    void soak() {
        System.out.println("正在制作中：黄豆和配料浸泡3小时");
    }

    void beat() {
        System.out.println("正在制作中：黄豆和配料放到豆浆机去打碎");
    }

    //钩子方法，决定是否需要添加配料
    boolean customerWantCondiments() {
        return true;
    }
}
