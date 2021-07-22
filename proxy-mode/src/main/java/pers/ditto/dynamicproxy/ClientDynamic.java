package pers.ditto.dynamicproxy;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-22 15:15
 */

@SuppressWarnings("all")
public class ClientDynamic {

    @Test
    public void testDynamic() {

        //创建目标对象
        ITeacherDao target = new TeacherDao();

        //给目标对象，创建代理对象, 可以转成 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();
        System.out.println();
        proxyInstance.sayHello("Tom");
    }
}
