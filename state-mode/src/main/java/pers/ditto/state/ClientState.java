package pers.ditto.state;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-08-01 10:16
 */

@SuppressWarnings("all")
public class ClientState {

    @Test
    public void testState() {

        // 创建活动对象，奖品有1个奖品
        RaffleActivity activity = new RaffleActivity(7);

        // 我们连续抽30次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("第" + (i + 1) + "次抽奖");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
            System.out.println();
        }
    }
}
