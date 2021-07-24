package pers.ditto.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author OrangeCH3
 * @create 2021-07-24 18:31
 */

@SuppressWarnings("all")
public class ObjectStructure {

    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void attach(Person p) {
        persons.add(p);
    }
    //移除
    public void detach(Person p) {
        persons.remove(p);
    }

    //显示测评情况
    public void display(Action action) {
        for(Person p: persons) {
            p.accept(action);
        }
    }
}
