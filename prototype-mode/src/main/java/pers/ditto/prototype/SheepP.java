package pers.ditto.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OrangeCH3
 * @create 2021-07-15 9:54
 */

@SuppressWarnings("all")
@NoArgsConstructor
@Data
public class SheepP implements Cloneable {

    private String name;
    private int age;
    private String color;
    private String address = "Dolly";
    public SheepP friend; //是对象, 克隆是会如何处理

    public SheepP(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone()  {

        SheepP sheepP = null;
        try {
            sheepP = (SheepP) super.clone();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return sheepP;
    }

}
