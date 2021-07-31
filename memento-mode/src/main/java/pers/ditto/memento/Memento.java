package pers.ditto.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author OrangeCH3
 * @create 2021-07-31 9:54
 */

@SuppressWarnings("all")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Memento {

    //攻击力
    private int vit;
    //防御力
    private int def;
}
