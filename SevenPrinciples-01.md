# Seven Principles

> 设计模式的目的

编写软件过程中，程序员面临着来自耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性等多方面的挑战，设计模式是为了让程序(软件)，具有更好的性质

- 代码重用性 (即：相同功能的代码，不用多次编写)
- 可读性 (即：编程规范性, 便于其他程序员的阅读和理解)
- 可扩展性 (即：当需要增加新的功能时，非常的方便，称为可维护)
- 可靠性 (即：当我们增加新的功能后，对原来的功能没有影响)
- 使程序呈现高内聚，低耦合的特性

---

> 设计模式七大原则

1. 单一职责原则
2. 接口隔离原则
3. 依赖倒转(倒置)原则
4. 里氏替换原则
5. 开闭原则
6. 迪米特法则
7. 合成复用原则

---

> 单一职责原则

对类来说的，即一个类应该只负责一项职责。如类 A 负责两个不同职责：职责 1，职责 2。当职责 1 需求变更而改变 A 时，可能造成职责 2 执行错误，所以需要将类 A 的粒度分解为 A1， A2

以交通工具为例：
```java
package pers.ditto.principle.singleresponsibility;

/**
 * @author OrangeCH3
 * @create 2021-07-06 16:29
 */

@SuppressWarnings("all")
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("雷诺");
        vehicle.run("飞机");
        vehicle.run("轮船");

    }


}

// 交通工具类
// 方式1
// 1. 方式1的run方法中违反了单一职责原则
// 2. 解决方案非常简单，根据交通工具运行方法不同，分解成不同类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路驰骋!");
    }
}
```

```java
package pers.ditto.principle.singleresponsibility;

/**
 * @author OrangeCH3
 * @create 2021-07-06 16:38
 */

@SuppressWarnings("all")
public class SingleResponsibilityDitto {

    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("雷诺");
        System.out.println();

        AirVehicle vehicle1 = new AirVehicle();
        vehicle1.run("飞机");
        System.out.println();

        WaterVehicle vehicle2 = new WaterVehicle();
        vehicle2.run("轮船");
    }

}


// 方式2
// 1. 遵守单一职责原则
// 2. 但是这样做改动比较大
// 3. 可以直接修改Vehicle类，改动的代码比较少
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路驰骋!");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空翱翔!");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中滑行!");
    }
}
```

```java
package pers.ditto.principle.singleresponsibility;

/**
 * @author OrangeCH3
 * @create 2021-07-06 16:44
 */

@SuppressWarnings("all")
public class SingleResponsibilityDittoo {

    public static void main(String[] args) {

        VehicleDitto vehicleDitto = new VehicleDitto();
        vehicleDitto.runRoad("雷诺");
        vehicleDitto.runAir("飞机");
        vehicleDitto.runWater("轮船");

    }

}

// 方式3
// 1. 这种修改方法没有对原来的类做大的修改，只是增加方法
// 2. 类上虽然没有执行单一职责，但是在方法上执行单一职责
class VehicleDitto {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路驰骋!");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中滑行!");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空翱翔!");
    }
}
```

单一职责原则注意事项和细节:
- 降低类的复杂度，一个类只负责一项职责
- 提高类的可读性，可维护性
- 降低变更引起的风险
- 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则

---

> 接口隔离原则

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上

案例(未使用接口隔离原则前)：类 A 通过接口 InterfaceA 依赖类 B，类 C 通过接口 InterfaceA 依赖类 D，如果接口 InterfaceA 对于类 A 和类 C 来说不是最小接口，那么类 B 和类 D 必须去实现他们不需要的方法

```java
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
```

案例(使用接口隔离原则后)：将接口 InterfaceA 拆分为独立的几个接口(这里我们拆分成 3 个接口)，类 A 和类 C 分别与他们需要的接口建立依赖关系。 也就是采用接口隔离原则

```java
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
```

---

> 依赖倒转原则

依赖倒转原则(Dependence Inversion Principle)是指：

1. 高层模块不应该依赖低层模块，二者都应该依赖其抽象
2. 抽象不应该依赖细节，细节应该依赖抽象
3. 依赖倒转(倒置)的中心思想是面向接口编程
4. 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在 java 中，抽象指的是接口或抽象类，细节就是具体的实现类
5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成

案例(未使用依赖倒转原则前):

```java
package pers.ditto.principle.inversion;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-07 18:30
 */

@SuppressWarnings("all")
public class DependenceInversion {

    public static void main(String[] args) {

        PersonTest personTest = new PersonTest();
        personTest.receive(new EmailTest());

    }

    // 也可以导入JUnit包插入@Test注解完成测试
    @Test
    public void testPerson() {
        PersonTest personTest = new PersonTest();
        personTest.receive(new EmailTest());
    }
}

// 完成要给Person接收消息的功能
// 方式1分析
// 1. 简单，比较容易实现
// 2. 如果获取的对象是微信、短信等，则需要新增类及类中方法
// 3. 解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
// 4. Email、WeChat等实现接口即可，这样才符合依赖倒转原则
class PersonTest {
    public void receive(EmailTest emailTest) {
        System.out.println(emailTest.getInfo());
    }
}

class EmailTest {
    public String getInfo() {
        return "电子邮件信息：Hello, OrangeCH3!";
    }
}
```

案例(使用依赖倒转原则后):

```java
package pers.ditto.principle.inversion;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-07 18:43
 */

@SuppressWarnings("all")
public class DependenceInversionDitto {

    @Test
    public void test() {

        // 客户端无需改变
        PersonDitto personDitto = new PersonDitto();
        personDitto.receive(new EmailDitto());
        System.out.println();

        personDitto.receive(new WeChatDitto());
    }
}

// 定义一个接口
interface IReceiver {
    String getInfo();
}

class EmailDitto implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：HelloDitto, OrangeCH3!";
    }
}

// 增加WeChat
class WeChatDitto implements IReceiver {

    @Override
    public String getInfo() {
        return "微信收到消息：HelloDitto, OrangeCH3!";
    }
}

class PersonDitto {

    // 这里是对接口的依赖
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
```

依赖倒转原则的注意事项和细节:
1. 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好
2. 变量的声明类型尽量是抽象类或接口, 这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
3. 继承时遵循里氏替换原则

---

> 里氏替换原则

TODO



