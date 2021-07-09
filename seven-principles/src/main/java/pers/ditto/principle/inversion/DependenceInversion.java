package pers.ditto.principle.inversion;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-07 18:30
 */

@SuppressWarnings("all")
public class DependenceInversion {

    public static void main(String[] args) {

        PersonTest personTest = new PersonTest();
        personTest.receive(new EmailTest());

    }

    // 也可以导入JUnit包插入@Test注解完成测试
    @Test
    public void testPerson() {
        PersonTest personTest = new PersonTest();
        personTest.receive(new EmailTest());
    }
}

// 完成要给Person接收消息的功能
// 方式1分析
// 1. 简单，比较容易实现
// 2. 如果获取的对象是微信、短信等，则需要新增类及类中方法
// 3. 解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
// 4. Email、WeChat等实现接口即可，这样才符合依赖倒转原则
class PersonTest {
    public void receive(EmailTest emailTest) {
        System.out.println(emailTest.getInfo());
    }
}

class EmailTest {
    public String getInfo() {
        return "电子邮件信息：Hello, OrangeCH3!";
    }
}
