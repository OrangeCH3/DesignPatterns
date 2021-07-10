package pers.ditto.singleton.lazydittoo;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 14:06
 */

@SuppressWarnings("all")
public class SingletonLazyDittoo {

    @Test
    public void test() {

        System.out.println("懒汉式 3 ， 线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

@SuppressWarnings("all")
class Singleton {

    public static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {

        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
