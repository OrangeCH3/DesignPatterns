package pers.ditto.principle.segregation;

/**
 * @author OrangeCH3
 * @create 2021-07-06 20:52
 */

@SuppressWarnings("all")
public class SegregationDitto {

    public static void main(String[] args) {

        // 使用接口隔离原则，实现类的功能函数没有冗余
        ClassADitto classADitto = new ClassADitto();
        classADitto.dependOne(new ClassBDitto());
        classADitto.dependTwo(new ClassBDitto());
        classADitto.dependThree(new ClassBDitto());
        System.out.println();

        ClassCDitto classCDitto = new ClassCDitto();
        classCDitto.dependOne(new ClassDDitto());
        classCDitto.dependFour(new ClassDDitto());
        classCDitto.dependFive(new ClassDDitto());

    }
}

// 接口隔离原则，使用三个接口进行功能函数隔离
interface InterfaceADitto {
    void operationOne();
}

interface InterfaceBDitto {
    void operationTwo();
    void operationThree();
}

interface InterfaceCDitto {
    void operationFour();
    void operationFive();
}

class ClassBDitto implements InterfaceADitto, InterfaceBDitto {

    @Override
    public void operationOne() {
        System.out.println("ClassB实现了operationOne");
    }

    @Override
    public void operationTwo() {
        System.out.println("ClassB实现了operationTwo");
    }

    @Override
    public void operationThree() {
        System.out.println("ClassB实现了operationThree");
    }
}

class ClassDDitto implements InterfaceADitto, InterfaceCDitto {

    @Override
    public void operationOne() {
        System.out.println("ClassD实现了operationOne");
    }

    @Override
    public void operationFour() {
        System.out.println("ClassD实现了operationFour");
    }

    @Override
    public void operationFive() {
        System.out.println("ClassD实现了operationFive");
    }
}

class ClassADitto {
    public void dependOne(InterfaceADitto interfaceADitto) {
        interfaceADitto.operationOne();
    }

    public void dependTwo(InterfaceBDitto interfaceBDitto) {
        interfaceBDitto.operationTwo();
    }

    public void dependThree(InterfaceBDitto interfaceBDitto) {
        interfaceBDitto.operationThree();
    }
}

class ClassCDitto {
    public void dependOne(InterfaceADitto interfaceADitto) {
        interfaceADitto.operationOne();
    }

    public void dependFour(InterfaceCDitto interfaceCDitto) {
        interfaceCDitto.operationFour();
    }

    public void dependFive(InterfaceCDitto interfaceCDitto) {
        interfaceCDitto.operationFive();
    }
}
