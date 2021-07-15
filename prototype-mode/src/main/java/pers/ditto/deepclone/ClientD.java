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
