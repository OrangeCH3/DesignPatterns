package pers.ditto.classadapter;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:06
 */

@SuppressWarnings("all")
public class Client {

    @Test
    public void test () {
        System.out.println(" === 类适配器模式 ===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
