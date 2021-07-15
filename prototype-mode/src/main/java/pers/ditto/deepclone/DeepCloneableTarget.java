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
