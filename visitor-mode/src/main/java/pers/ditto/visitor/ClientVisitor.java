package pers.ditto.visitor;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-24 18:31
 */

@SuppressWarnings("all")
public class ClientVisitor {

    @Test
    public void testVisitor() {

        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //男女均给成功牌
        Success success = new Success();
        objectStructure.display(success);
        System.out.println();

        //男女均给失败牌
        Fail fail = new Fail();
        objectStructure.display(fail);
        System.out.println();

        //男女均给待定牌
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
