package pers.ditto.visitor;

/**
 * @author OrangeCH3
 * @create 2021-07-24 18:29
 */

@SuppressWarnings("all")
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男性观众举待定牌：歌手票数不变!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性观众举待定牌：歌手票数不变!");
    }
}
