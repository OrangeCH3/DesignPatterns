package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-07-15 16:40
 */

@SuppressWarnings("all")
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
