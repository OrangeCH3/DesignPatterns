package pers.ditto.principle.inversion;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-07 18:43
 */

@SuppressWarnings("all")
public class DependenceInversionDitto {

    @Test
    public void test() {

        // 客户端无需改变
        PersonDitto personDitto = new PersonDitto();
        personDitto.receive(new EmailDitto());
        System.out.println();

        personDitto.receive(new WeChatDitto());
    }
}

// 定义一个接口
interface IReceiver {
    String getInfo();
}

class EmailDitto implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：HelloDitto, OrangeCH3!";
    }
}

// 增加WeChat
class WeChatDitto implements IReceiver {

    @Override
    public String getInfo() {
        return "微信收到消息：HelloDitto, OrangeCH3!";
    }
}

class PersonDitto {

    // 这里是对接口的依赖
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
