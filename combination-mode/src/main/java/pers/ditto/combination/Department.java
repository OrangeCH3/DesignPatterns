package pers.ditto.combination;

/**
 * @author OrangeCH3
 * @create 2021-07-20 11:02
 */

@SuppressWarnings("all")
public class Department extends OrganizationComponent{

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    //add(), remove()方法不用重写，因为是叶子节点

    @Override
    protected void print() {

        System.out.println(getName());
    }
}
