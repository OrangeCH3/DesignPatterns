package pers.ditto.interpreter;

import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:43
 */

@SuppressWarnings("all")
public abstract class Expression {

    // a + b - c
    // 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
