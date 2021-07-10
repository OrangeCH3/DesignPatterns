package pers.ditto.singleton.doublecheck;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 14:14
 */

@SuppressWarnings("all")
public class DoubleCheck {

    @Test
    public void test() {

        System.out.println("双重检查");
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
    private static volatile Singleton instance;
    private Singleton() {}
    // 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    // 同时保证了效率, 推荐使用
    public static synchronized Singleton getInstance()
    { if(instance == null) {
        synchronized (Singleton.class)
        { if(instance == null) {
            instance = new Singleton();
        }
        }
    }
        return instance;
    }
}