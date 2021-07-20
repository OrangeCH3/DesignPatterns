package pers.ditto.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OrangeCH3
 * @create 2021-07-20 11:00
 */

@SuppressWarnings("all")
public class College extends OrganizationComponent{

    //List 中 存放的Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }


    @Override
    protected void print() {

        System.out.println("---" + getName() + "---");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
