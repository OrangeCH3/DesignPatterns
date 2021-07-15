# Prototype Mode

> 克隆羊问题

现在有一只羊 tom，姓名为: tom, 年龄为： 1，颜色为：白色，请编写程序创建和 tom 羊 属性完全相同的 10
只羊

---

> 传统方式解决克隆羊问题

代码演示如下所示：

```java
package pers.ditto.traditional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:42
 */

@SuppressWarnings("all")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SheepT {

    private String name;
    private int age;
    private String color;

}
```

```java
package pers.ditto.traditional;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:40
 */

@SuppressWarnings("all")
public class ClientT {

    @Test
    public void test() {

        SheepT sheep = new SheepT("tom", 1, "白色");

        SheepT sheep2 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        SheepT sheep3 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        SheepT sheep4 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        SheepT sheep5 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        //....

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
```

传统的方式的优缺点:

1. 优点是比较好理解，简单易操作
2. 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低
3. 总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活
4. 改进的思路分析：Java 中 Object 类是所有类的根类， Object 类提供了一个 clone()方法，该方法可以将一个 Java 对象复制一份，但是需要实现 clone 的 Java 类必须要实现一个接口 Cloneable，该接口表示该类能够复制且具有复制的能力 = 原型模式

---

> 原型模式

原型模式基本介绍：

1. 原型模式(Prototype 模式)是指：用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象
2. 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节
3. 工作原理是：通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建，即 对象.clone()
4. 形象的理解：孙大圣拔出猴毛， 变出其它孙大圣

使用原型模式改进传统方式，让程序具有更高的效率和扩展性，代码演示如下：

```java
package pers.ditto.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:54
 */

@SuppressWarnings("all")
@NoArgsConstructor
@Data
public class SheepP implements Cloneable {

    private String name;
    private int age;
    private String color;
    private String address = "Dolly";
    public SheepP friend; //是对象, 克隆是会如何处理

    public SheepP(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone()  {

        SheepP sheepP = null;
        try {
            sheepP = (SheepP) super.clone();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return sheepP;
    }

}
```

```java
package pers.ditto.prototype;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:54
 */

@SuppressWarnings("all")
public class ClientP {

    @Test
    public void test() {

        System.out.println("原型模式完成对象的创建");

        SheepP sheep = new SheepP("tom", 1, "白色");

        sheep.friend = new SheepP("jack", 2, "黑色");

        SheepP sheep2 = (SheepP) sheep.clone(); //克隆
        SheepP sheep3 = (SheepP) sheep.clone(); //克隆
        SheepP sheep4 = (SheepP) sheep.clone(); //克隆
        SheepP sheep5 = (SheepP) sheep.clone(); //克隆

        System.out.println("sheep2 =" + sheep2 + " | sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + " | sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + " | sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + " | sheep5.friend=" + sheep5.friend.hashCode());
    }
}
```

---

> 深入讨论-浅拷贝和深拷贝

浅拷贝基本介绍:

1. 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象
2. 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
3. 前面我们克隆羊就是浅拷贝
4. 浅拷贝是使用默认的 clone()方法来实现sheep = (Sheep) super.clone()

深拷贝基本介绍：

1. 复制对象的所有基本数据类型的成员变量值
2. 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象(包括对象的引用类型)进行拷贝
3. 深拷贝实现方式 1：重写 clone() 方法来实现深拷贝
4. 深拷贝实现方式 2：通过对象序列化实现深拷贝（推荐）

深拷贝应用实例：

```java
package pers.ditto.deepclone;

import java.io.Serializable;

/**
 * @author OrangeCH3
 * @create 2021-07-15 10:26
 */

@SuppressWarnings("all")
public class DeepCloneableTarget implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    // 构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```

```java
package pers.ditto.deepclone;

import java.io.*;

/**
 * @author OrangeCH3
 * @create 2021-07-15 10:24
 */

@SuppressWarnings("all")
public class DeepProtoType implements Serializable, Cloneable{

    public String name; //String 属性
    public DeepCloneableTarget deepCloneableTarget;// 引用类型
    public DeepProtoType() {
        super();
    }


    //深拷贝 - 方式 1 使用clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    //深拷贝 - 方式2 通过对象的序列化实现 (推荐)
    public Object deepClone() {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();

            return copyObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }
}
```

```java
package pers.ditto.deepclone;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-15 10:27
 */

@SuppressWarnings("all")
public class ClientD {

    @Test
    public void test() throws CloneNotSupportedException {

        DeepProtoType p = new DeepProtoType();
        p.name = "OrangeCH3";
        p.deepCloneableTarget = new DeepCloneableTarget("Sun", "Galaxy");

        //方式1 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();
	    System.out.println("p.name=" + p.name + " | p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p2.name + " | p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
        System.out.println();

        //方式2 完成深拷贝
        DeepProtoType p3 = (DeepProtoType) p.deepClone();

        System.out.println("p.name=" + p.name + " | p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p3.name + " | p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }
}
```

---

> 原型模式的注意事项和细节

1. 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率
2. 不用重新初始化对象，而是动态地获得对象运行时的状态
3. 如果原始对象发生变化(增加或者减少属性)，其它克隆对象的也会发生相应的变化，无需修改代码
4. 在实现深克隆的时候可能需要比较复杂的代码
5. 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源代码，违背了 ocp 原则，这点请同学们注意