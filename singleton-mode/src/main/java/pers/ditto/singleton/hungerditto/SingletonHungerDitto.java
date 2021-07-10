package pers.ditto.singleton.hungerditto;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 13:36
 */

@SuppressWarnings("all")
public class SingletonHungerDitto {

    @Test
    public void test() {

        // 测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

// 饿汉式(静态代码块)
@SuppressWarnings("all")
class Singleton {
    // 1. 构造器私有化, 外部能 new
    private Singleton() {
    }
    // 2.本类内部创建对象实例
    private static Singleton instance;
    static { // 在静态代码块中，创建单例对象
        instance = new Singleton();
    }
    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance()
    { return instance;
    }
}