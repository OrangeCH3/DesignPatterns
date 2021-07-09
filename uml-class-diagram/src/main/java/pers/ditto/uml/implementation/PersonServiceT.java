package pers.ditto.uml.implementation;

/**
 * @author OrangeCH3
 * @create 2021-07-09 14:35
 */

@SuppressWarnings("all")
public interface PersonServiceT {

    public void delete(Integer id);
}

class PersonServiceTImpl implements PersonServiceT {

    @Override
    public void delete(Integer id) {
        System.out.println("您删除了"+ id +"号");
    }
}
