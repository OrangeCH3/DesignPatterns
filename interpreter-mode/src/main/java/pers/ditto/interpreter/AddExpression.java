package pers.ditto.interpreter;

import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:46
 */

@SuppressWarnings("all")
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    public int interpreter(HashMap<String, Integer> var) {
        //super.left.interpreter(var) ： 返回 left 表达式对应的值 a = 10
        //super.right.interpreter(var):  返回 right 表达式对应的值 b = 20
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
