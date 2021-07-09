package pers.ditto.uml.dependence;

/**
 * @author OrangeCH3
 * @create 2021-07-09 14:14
 */

@SuppressWarnings("all")
public class PersonServiceBean {

    private PersonDaoT personDaoT;

    public void save(PersonT personT) {}

    public void modify(){
        DepartmentT departmentT = new DepartmentT();
        IDCardT idCardT = new IDCardT();
    }


}

class PersonDaoT{}

class IDCardT{}

class PersonT{}

class DepartmentT{}
