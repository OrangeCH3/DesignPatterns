package pers.ditto.flyweight;

/**
 * @author OrangeCH3
 * @create 2021-07-21 15:41
 */

@SuppressWarnings("all")
public class ConcreteWebSite extends WebSite{

    //共享的部分，内部状态
    private String type = ""; //网站发布的形式(类型)


    //构造器
    public ConcreteWebSite(String type) {

        this.type = type;
    }

    @Override
    public void use(User user) {

    }
}
