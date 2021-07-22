package pers.ditto.staticproxy;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-22 14:52
 */

@SuppressWarnings("all")
public class ClientStatic {

    @Test
    public void testStatic() {

        //创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象, 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
