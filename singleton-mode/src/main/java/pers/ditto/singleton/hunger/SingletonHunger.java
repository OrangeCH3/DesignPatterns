package pers.ditto.singleton.hunger;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-10 13:32
 */

@SuppressWarnings("all")
public class SingletonHunger {

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

// 饿汉式(静态变量)
@SuppressWarnings("all")
class Singleton {
    // 1. 构造器私有化, 外部能 new
    private Singleton() {

    }

    // 2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}