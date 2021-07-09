package pers.ditto.principle.ocp;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-09 11:25
 */

@SuppressWarnings("all")
public class Ocp {

    @Test
    public void test() {

        // 方式1
        // 1. 方式1优点是比较好理解，简单易操作
        // 2. 缺点是违反了设计模式的 ocp 原则，即对扩展开放(提供方)，对修改关闭(使用方)。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码
        // 3. 比如我们这时要新增加一个图形种类 三角形，我们需要做如下修改，修改的地方较多
        // 改进思路：把创建 Shape 类做成抽象类， 并提供一个抽象的 draw 方法，让子类去实现即可，这样我们有新的图形种类时，只需要让新的图形类继承 Shape，并实现 draw 方法即可，使用方的代码就不需要修改
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

// 这是一个用于绘图的类[使用方]
class GraphicEditor {
    //接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        else if (s.m_type == 3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r)
    { System.out.println(" 绘制矩形 ");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }

    //绘制三角形
    public void drawTriangle(Shape r)
    { System.out.println(" 绘制三角形 ");
    }
}

//Shape 类，基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
    super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
    super.m_type = 2;
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
    super.m_type = 3;
    }
}