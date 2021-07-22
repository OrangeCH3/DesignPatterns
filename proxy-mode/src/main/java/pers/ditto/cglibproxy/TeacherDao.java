package pers.ditto.cglibproxy;

/**
 * @author OrangeCH3
 * @create 2021-07-22 15:34
 */

@SuppressWarnings("all")
public class TeacherDao {

    public String teach() {
        System.out.println("老师正在授课中");
        return "这是一条授课完成回执信息";
    }
}
