package pers.ditto.bridge;

/**
 * @author OrangeCH3
 * @create 2021-07-17 9:56
 */

@SuppressWarnings("all")
public class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}
