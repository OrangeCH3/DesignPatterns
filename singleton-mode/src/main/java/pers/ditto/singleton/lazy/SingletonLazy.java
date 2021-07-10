package pers.ditto.singleton.lazy;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 13:47
 */

@SuppressWarnings("all")
public class SingletonLazy {

    @Test
    public void test() {

        System.out.println("懒汉式 1，线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

@SuppressWarnings("all")
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    // 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    // 即懒汉式
    public static Singleton getInstance() {
        if(instance == null) {
        instance = new Singleton();
    }
        return instance;
    }
}
