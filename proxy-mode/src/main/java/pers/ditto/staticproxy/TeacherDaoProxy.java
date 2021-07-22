package pers.ditto.staticproxy;

/**
 * @author OrangeCH3
 * @create 2021-07-22 14:50
 */

//代理对象,静态代理
@SuppressWarnings("all")
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; // 目标对象，通过接口来聚合


    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {

        System.out.println("代课老师课前准备"); //方法
        target.teach();
        System.out.println("代课老师授课完成");
    }
}
