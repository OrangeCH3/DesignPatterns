package pers.ditto.objectadapter;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-16 10:22
 */

@SuppressWarnings("all")
public class Client {

    @Test
    public void test() {

        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
