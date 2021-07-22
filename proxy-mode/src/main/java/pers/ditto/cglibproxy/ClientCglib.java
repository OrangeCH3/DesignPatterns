package pers.ditto.cglibproxy;

import org.junit.Test;

import java.security.PublicKey;

/**
 * @author OrangeCH3
 * @create 2021-07-22 15:39
 */

@SuppressWarnings("all")
public class ClientCglib {

    @Test
    public void testCglib() {

        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println();
        System.out.println("教师回执信息 → " + res);
    }
}
