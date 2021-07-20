package pers.ditto.combination;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OrangeCH3
 * @create 2021-07-20 10:51
 */

@SuppressWarnings("all")
@AllArgsConstructor
@NoArgsConstructor
@Data
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

    //方法print, 做成抽象的, 子类都需要实现
    protected abstract void print();
}
