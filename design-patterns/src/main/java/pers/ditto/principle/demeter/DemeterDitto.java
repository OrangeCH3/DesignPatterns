package pers.ditto.principle.demeter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OrangeCH3
 * @create 2021-07-09 12:15
 */

@SuppressWarnings("all")
public class DemeterDitto {

    @Test
    public void test() {

        System.out.println("使用迪米特法则后->Ditto");
        // 创建了一个 SchoolManager 对象
        SchoolManagerDitto schoolManagerDitto = new SchoolManagerDitto();
        // 输出学院的员工 id 和 学校总部的员工信息
        schoolManagerDitto.printAllEmployee(new CollegeManagerDitto());
    }
}

// 学校总部员工类
class EmployeeDitto {
    private String id;

    public void setId(String id)
    { this.id = id;
    }
    public String getId()
    { return id;
    }
}

// 学院的员工类
class CollegeEmployeeDitto {
    private String id;

    public void setId(String id)
    { this.id = id;
    }

    public String getId()
    { return id;
    }
}

// 管理学院员工的管理类
class CollegeManagerDitto {
    // 返回学院的所有员工
    public List<CollegeEmployeeDitto> getAllEmployee() {
        List<CollegeEmployeeDitto> list = new ArrayList<CollegeEmployeeDitto>();
        for (int i = 0; i < 10; i++) { //这里我们增加了 10 个员工到 list
            CollegeEmployeeDitto emp = new CollegeEmployeeDitto();
            emp.setId("学院员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    // 输出学院员工的信息
    public void printEmployee() {
        // 获取到学院员工
        List<CollegeEmployeeDitto> list1 = getAllEmployee();
        System.out.println("学院员工学院员工ID信息如下：");
        for (CollegeEmployeeDitto e : list1) {
            System.out.println(e.getId());
        }
    }
}

// 学校管理类
// 分析 SchoolManager 类的直接朋友类有哪些 Employee、 CollegeManager
// CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
class SchoolManagerDitto {
    //返回学校总部的员工
    public List<EmployeeDitto> getAllEmployee() {
        List<EmployeeDitto> list = new ArrayList<EmployeeDitto>();
        for (int i = 0; i < 5; i++) { //这里我们增加了 5 个员工到 list
            EmployeeDitto emp = new EmployeeDitto();
            emp.setId("学校总部员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    // 该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManagerDitto sub) {
        // 分析问题
        // 1. 将输出学院的员工方法，封装到 CollegeManager
        sub.printEmployee();
        // 获取到学校总部员工
        List<EmployeeDitto> list2 = this.getAllEmployee();
        System.out.println("学校总部员工ID信息如下：");
        for (EmployeeDitto e : list2) {
            System.out.println(e.getId());
        }
    }
}
