package pers.ditto.staticproxy;

/**
 * @author OrangeCH3
 * @create 2021-07-22 14:49
 */

@SuppressWarnings("all")
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }
}
