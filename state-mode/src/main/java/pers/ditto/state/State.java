package pers.ditto.state;

/**
 * @author OrangeCH3
 * @create 2021-08-01 10:10
 */

@SuppressWarnings("all")
public abstract class State {

    // 扣除积分: -50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract  void dispensePrize();
}
