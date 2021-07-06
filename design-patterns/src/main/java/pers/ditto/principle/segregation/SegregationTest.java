package pers.ditto.principle.segregation;

/**
 * @author OrangeCH3
 * @create 2021-07-06 20:32
 */

@SuppressWarnings("all")
public class SegregationTest {

    public static void main(String[] args) {

        // A类对象只会依赖使用B实现类的operationOne/Two/Three方法，B实现类的operationFour/Five方法冗余
        ClassA classA = new ClassA();
        classA.dependOne(new ClassB());
        classA.dependTwo(new ClassB());
        classA.dependThree(new ClassB());
        System.out.println();

        // C类对象只会依赖使用D实现类的operationOne/Four/Five方法,D实现类的operationTwo/Three方法冗余
        ClassC classC = new ClassC();
        classC.dependOne(new ClassD());
        classC.dependFour(new ClassD());
        classC.dependFive(new ClassD());

    }
}


interface InterfaceA {
    void operationOne();
    void operationTwo();
    void operationThree();
    void operationFour();
    void operationFive();
}

class ClassB implements InterfaceA {

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

    @Override
    public void operationFour() {
        System.out.println("ClassB实现了operationFour");
    }

    @Override
    public void operationFive() {
        System.out.println("ClassB实现了operationFive");
    }
}


class ClassD implements InterfaceA {

    @Override
    public void operationOne() {
        System.out.println("ClassD实现了operationOne");
    }

    @Override
    public void operationTwo() {
        System.out.println("ClassD实现了operationTwo");
    }

    @Override
    public void operationThree() {
        System.out.println("ClassD实现了operationThree");
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


// A类通过接口InterfaceA依赖使用B类，用到operationOne/Two/Three方法
class ClassA {
    public void dependOne(InterfaceA interfaceA) {
        interfaceA.operationOne();
    }

    public void dependTwo(InterfaceA interfaceA) {
        interfaceA.operationTwo();
    }

    public void dependThree(InterfaceA interfaceA) {
        interfaceA.operationThree();
    }
}


// C类通过接口InterfaceA依赖使用D类，用到operationOne/Four/Five方法
class ClassC {
    public void dependOne(InterfaceA interfaceA) {
        interfaceA.operationOne();
    }

    public void dependFour(InterfaceA interfaceA) {
        interfaceA.operationFour();
    }

    public void dependFive(InterfaceA interfaceA) {
        interfaceA.operationFive();
    }
}
