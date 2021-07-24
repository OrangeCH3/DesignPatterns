package pers.ditto.visitor;

/**
 * @author OrangeCH3
 * @create 2021-07-24 18:20
 */

@SuppressWarnings("all")
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
