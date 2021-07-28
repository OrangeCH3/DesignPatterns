package pers.ditto.iterator;

import java.util.Iterator;

/**
 * @author OrangeCH3
 * @create 2021-07-28 16:40
 */

@SuppressWarnings("all")
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();
}
