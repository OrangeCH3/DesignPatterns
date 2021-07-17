package pers.ditto.bridge;

/**
 * @author OrangeCH3
 * @create 2021-07-17 9:58
 */

@SuppressWarnings("all")
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {

        System.out.print(" 折叠样式 →");
        super.open();
    }

    public void close() {

        System.out.print(" 折叠样式 →");
        super.close();
    }

    public void call() {

        System.out.print(" 折叠样式 →");
        super.call();
    }
}
