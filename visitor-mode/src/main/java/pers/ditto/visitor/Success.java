package pers.ditto.visitor;

/**
 * @author OrangeCH3
 * @create 2021-07-24 18:22
 */
@SuppressWarnings("all")
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男性观众举成功牌：歌手票数 +1 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性观众举成功牌：歌手票数 +1 !");
    }
}
