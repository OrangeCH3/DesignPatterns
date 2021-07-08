package pers.ditto.principle.liskov;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-08 10:41
 */

@SuppressWarnings("all")
public class LiskovDitto {

    @Test
    public void test() {

        LiskovADitto liskovADitto = new LiskovADitto();
        System.out.println("13 - 9 = " + liskovADitto.func(13, 9));
        System.out.println();

        // 应用里氏替换原则后，调用的方法就会很明确
        LiskovBDitto liskovBDitto = new LiskovBDitto();
        System.out.println("1 + 3 = " + liskovBDitto.func(1, 3));
        System.out.println("1 + 3 + 9 = " + liskovBDitto.funcImprove(1, 3));

    }
}

// 首先创建一个更加基础的类
class LiskovBase {

}

class LiskovADitto {
    public int func(int num1, int num2) {
        return num1 - num2;
    }
}

// 应用里氏替换原则降低类之间的耦合度
class LiskovBDitto extends LiskovBase {
    public int func(int a, int b) {
        return a + b;
    }

    public int funcImprove(int a, int b) {
        return func(a, b) + 9;
    }
}
