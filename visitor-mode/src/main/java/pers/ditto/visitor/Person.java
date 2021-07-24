package pers.ditto.visitor;

/**
 * @author OrangeCH3
 * @create 2021-07-24 18:20
 */

@SuppressWarnings("all")
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
