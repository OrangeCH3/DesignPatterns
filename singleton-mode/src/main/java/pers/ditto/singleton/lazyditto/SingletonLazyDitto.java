package pers.ditto.singleton.lazyditto;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 13:52
 */

@SuppressWarnings("all")
public class SingletonLazyDitto {

    @Test
    public void test() {

        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 懒汉式(线程安全，同步方法)
@SuppressWarnings("all")
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    // 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    // 即懒汉式
    public static synchronized Singleton getInstance()
    { if(instance == null) {
        instance = new Singleton();
    }
        return instance;
    }
}