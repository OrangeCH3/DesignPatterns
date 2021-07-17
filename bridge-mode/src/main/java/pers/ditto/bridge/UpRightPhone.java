package pers.ditto.bridge;

/**
 * @author OrangeCH3
 * @create 2021-07-17 10:00
 */

@SuppressWarnings("all")
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {

        System.out.print(" 直板样式 →");
        super.open();
    }

    public void close() {

        System.out.print(" 直板样式 →");
        super.close();
    }

    public void call() {

        System.out.print(" 直板样式 →");
        super.call();
    }
}
