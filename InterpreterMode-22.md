# Interpreter Mode

> 四则运算问题

实现四则运算，如计算 a+b-c 的值，具体要求：

1. 先输入表达式的形式，比如 a+b+c-d+e, 要求表达式的字母不能重复
2. 在分别输入 a ,b, c, d, e 的值
3. 最后求出结果

![四则运算问题](./PictureMaterial/四则运算问题.png)

---

> 传统方案解决四则运算问题

1. 编写一个方法，接收表达式的形式，然后根据用户输入的数值进行解析，得到结果
2. 问题分析：如果加入新的运算符，比如 * / ( 等等，不利于扩展，另外让一个方法来解析会造成程序结构混乱， 不够清晰
3. 解决方案：可以考虑使用解释器模式， 即： 表达式 → 解释器(可以有多种) → 结果

---

> 解释器模式解决四则运算问题

基本介绍：

1. 在编译原理中，一个算术表达式通过词法分析器形成词法单元，而后这些词法单元再通过语法分析器构建语法分析树，最终形成一颗抽象的语法分析树。这里的词法分析器和语法分析器都可以看做是解释器
2. 解释器模式（Interpreter Pattern） ：是指给定一个语言(表达式)，定义它的文法的一种表示，并定义一个解释器，使用该解释器来解释语言中的句子(表达式)
3. 应用场景比较多
   1. 应用可以将一个需要解释执行的语言中的句子表示为一个抽象语法树
   2. 一些重复出现的问题可以用一种简单的语言来表达
   3. 一个简单语法需要解释的场景
4. 这样的例子还有编译器、运算表达式计算、正则表达式、机器人等

原理类图：

![解释器模式解决四则运算问题](./PictureMaterial/解释器模式解决四则运算问题.png)

代码实现：

```java
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
```

```java
package pers.ditto.interpreter;

import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:44
 */

@SuppressWarnings("all")
public class SymbolExpression extends Expression{

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为 SymbolExpression 是让其子类来实现，因此 interpreter 是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
```

```java
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
```

```java
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
```

```java
package pers.ditto.interpreter;

import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:48
 */

@SuppressWarnings("all")
public class SubExpression extends SymbolExpression{

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    //求出left 和 right 表达式相减后的结果
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
```

```java
package pers.ditto.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:51
 */

@SuppressWarnings("all")
public class Calculator {

    // 定义表达式
    private Expression expression;

    // 构造函数传参，并解析
    public Calculator(String expStr) { // expStr = a+b
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();// [a, +, b]

        Expression left = null;
        Expression right = null;
        //遍历我们的字符数组， 即遍历  [a, +, b]
        //针对不同的情况，做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //
                    left = stack.pop();// 从stack取出left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i]));// 取出右表达式 "b"
                    stack.push(new AddExpression(left, right));// 然后根据得到left 和 right 构建 AddExpresson加入stack
                    break;
                case '-': //
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //如果是一个 Var 就创建要给 VarExpression 对象，并push到 stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个 charArray 数组后，stack 就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式a+b和 var = {a=10,b=20}
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
```

```java
package pers.ditto.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author OrangeCH3
 * @create 2021-07-31 20:52
 */

@SuppressWarnings("all")
public class ClientInterpreter {

    public static void main(String[] args) throws IOException {

        String expStr = getExpStr(); // a+b
        HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }

    // 获得表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    // 获得值映射
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }

        return map;
    }
}
```

解释器模式的注意事项和细节：

1. 当有一个语言需要解释执行，可将该语言中的句子表示为一个抽象语法树，就可以考虑使用解释器模式，让程序具有良好的扩展性
2. 应用场景有编译器、运算表达式计算、正则表达式、机器人等
3. 使用解释器可能带来一些问题，解释器模式会引起类膨胀、解释器模式采用递归调用方法，将会导致调试非常复杂、效率可能降低
