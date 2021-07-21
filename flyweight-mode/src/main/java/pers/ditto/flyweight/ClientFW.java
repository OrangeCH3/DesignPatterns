package pers.ditto.flyweight;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-21 15:46
 */

@SuppressWarnings("all")
public class ClientFW {

    @Test
    public void testFW() {

        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        // 客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");


        webSite1.use(new User("Tom"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");

        webSite2.use(new User("Jack"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");

        webSite3.use(new User("Smith"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite4 = factory.getWebSiteCategory("博客");

        webSite4.use(new User("King"));

        System.out.println("网站共产生了" + factory.getWebSiteCount() + "个实例");
    }
}
