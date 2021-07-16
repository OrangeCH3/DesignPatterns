package pers.ditto.interfaceadapter;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:34
 */

@SuppressWarnings("all")
public class Client {

    @Test
    public void test() {

        AbsAdapter absAdapter = new AbsAdapter() {

            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };

        absAdapter.m1();
    }
}
