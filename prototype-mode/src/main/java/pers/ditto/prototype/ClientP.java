package pers.ditto.prototype;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:54
 */

@SuppressWarnings("all")
public class ClientP {

    @Test
    public void test() {

        System.out.println("原型模式完成对象的创建");

        SheepP sheep = new SheepP("tom", 1, "白色");

        sheep.friend = new SheepP("jack", 2, "黑色");

        SheepP sheep2 = (SheepP) sheep.clone(); //克隆
        SheepP sheep3 = (SheepP) sheep.clone(); //克隆
        SheepP sheep4 = (SheepP) sheep.clone(); //克隆
        SheepP sheep5 = (SheepP) sheep.clone(); //克隆

        System.out.println("sheep2 =" + sheep2 + " | sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + " | sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + " | sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + " | sheep5.friend=" + sheep5.friend.hashCode());
    }
}
