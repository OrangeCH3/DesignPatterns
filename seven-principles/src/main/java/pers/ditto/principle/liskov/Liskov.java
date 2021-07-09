package pers.ditto.principle.liskov;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-08 10:29
 */

@SuppressWarnings("all")
public class Liskov {

    @Test
    public void test() {
        LiskovA liskovA = new LiskovA();
        System.out.println("11 - 3 = " + liskovA.func(11, 3));
        System.out.println();

        LiskovB liskovB = new LiskovB();
        // 本意是求11-3，但由于重写父类方法，造成错误
        System.out.println("11 - 3 = " + liskovB.func(11, 3));
        System.out.println("11 - 3 + 9 = " + liskovB.funcImprove(11, 3));
        System.out.println();
        // 重写方法后实际的结果为下
        System.out.println("11 + 3 = " + liskovB.func(11, 3));
        System.out.println("11 + 3 + 9 = " + liskovB.funcImprove(11, 3));
    }
}

class LiskovA {
    public int func(int num1, int num2) {
        return num1 - num2;
    }
}

// 本意为B类新增一个加法函数，而在编程中无意将A类的func函数重写
class LiskovB extends LiskovA {
    public int func(int a, int b) {
        return a + b;
    }

    public int funcImprove(int a, int b) {
        return func(a, b) + 9;
    }
}