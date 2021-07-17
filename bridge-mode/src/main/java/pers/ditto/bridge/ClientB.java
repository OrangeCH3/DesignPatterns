package pers.ditto.bridge;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-17 10:01
 */

@SuppressWarnings("all")
public class ClientB {

    @Test
    public void testBridge() {

        //获取折叠式手机 (样式 + 品牌 )

        Phone phone1 = new FoldedPhone(new XiaoMi());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println();

        Phone phone2 = new FoldedPhone(new Vivo());

        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println();

        Phone phone3 = new UpRightPhone(new XiaoMi());

        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println();

        Phone phone4 = new UpRightPhone(new Vivo());

        phone4.open();
        phone4.call();
        phone4.close();
    }
}
