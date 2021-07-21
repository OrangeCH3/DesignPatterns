package pers.ditto.flyweight;

import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-21 15:43
 */

@SuppressWarnings("all")
public class WebSiteFactory {

    //集合， 充当池的作用
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中
            pool.put(type, new ConcreteWebSite(type));
        }

        return (WebSite)pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getWebSiteCount() {
        return pool.size();
    }
}
