package pers.ditto.builder;

/**
 * @author OrangeCH3
 * @create 2021-07-15 16:51
 */

@SuppressWarnings("all")
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
