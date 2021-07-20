package pers.ditto.combination;

/**
 * @author OrangeCH3
 * @create 2021-07-20 10:51
 */

@SuppressWarnings("all")
public abstract class OrganizationComponent {

    private String name; // 名字
    private String des; // 说明

    protected  void add(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }
}
