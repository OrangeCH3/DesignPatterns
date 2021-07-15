package pers.ditto.traditional;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:40
 */

@SuppressWarnings("all")
public class ClientT {

    @Test
    public void test() {

        SheepT sheep = new SheepT("tom", 1, "白色");

        SheepT sheep2 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        SheepT sheep3 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        SheepT sheep4 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        SheepT sheep5 = new SheepT(sheep.getName(), sheep.getAge(), sheep.getColor());
        //....

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}


