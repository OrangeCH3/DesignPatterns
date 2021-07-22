package pers.ditto.dynamicproxy;

/**
 * @author OrangeCH3
 * @create 2021-07-22 15:11
 */

@SuppressWarnings("all")
public class TeacherDao implements ITeacherDao{


    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Say hello to: " + name);
    }
}
