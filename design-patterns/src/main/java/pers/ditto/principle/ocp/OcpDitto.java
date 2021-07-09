package pers.ditto.principle.ocp;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-09 11:32
 */

@SuppressWarnings("all")
public class OcpDitto {

    @Test
    public void test() {

        // 改进后的代码符合开闭原则
        GraphicEditorDitto graphicEditorDitto = new GraphicEditorDitto();
        graphicEditorDitto.drawShape(new RectangleDitto());
        graphicEditorDitto.drawShape(new CircleDitto());
        graphicEditorDitto.drawShape(new TriangleDitto());
        graphicEditorDitto.drawShape(new OtherGraphicDitto());
    }
}

//这是一个用于绘图的类 [使用方]
class GraphicEditorDitto {
    //接收 Shape 对象，调用 draw 方法
    public void drawShape(ShapeDitto s) {
        s.draw();
    }
}

//Shape 类，基类
abstract class ShapeDitto {
    int m_type;
    public abstract void draw();//抽象方法
}

class RectangleDitto extends ShapeDitto {

    RectangleDitto() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形-OCP ");
    }
}

class CircleDitto extends ShapeDitto {

    CircleDitto() {
    super.m_type = 2;
    }

    @Override
    public void draw() {

        System.out.println(" 绘制圆形-OCP ");
    }
}

//新增画三角形
class TriangleDitto extends ShapeDitto {

    TriangleDitto() {
    super.m_type = 3;
}
    @Override
    public void draw() {

        System.out.println(" 绘制三角形-OCP ");
    }
}

//新增一个图形
class OtherGraphicDitto extends ShapeDitto {
    OtherGraphicDitto() {
    super.m_type = 4;
}
    @Override
    public void draw() {

        System.out.println(" 绘制其它图形-OCP ");
    }
}