package pers.ditto.traditional;

/**
 * @author OrangeCH3
 * @create 2021-07-15 16:40
 */

@SuppressWarnings("all")
public class CommonHouse extends AbstractHouse{


    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
