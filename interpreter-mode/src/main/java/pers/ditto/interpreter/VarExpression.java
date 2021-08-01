package pers.ditto.interpreter;

import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:45
 */

@SuppressWarnings("all")
public class VarExpression extends Expression{

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是 {a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
