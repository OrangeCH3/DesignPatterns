package pers.ditto.singleton.enumerate;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 14:45
 */

@SuppressWarnings("all")
public class SingletonEnumerate {

    @Test
    public void test() {

        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOK();
    }
}

//使用枚举，可以实现单例, 推荐
@SuppressWarnings("all")
enum Singleton {
    INSTANCE; //属性
    public void sayOK()
    { System.out.println("OK");
    }
}