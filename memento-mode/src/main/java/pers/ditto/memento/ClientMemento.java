package pers.ditto.memento;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-31 9:57
 */

@SuppressWarnings("all")
public class ClientMemento {

    @Test
    public void testMemento() {

        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);

        System.out.println("和boss大战前的状态");
        gameRole.display();

        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战ing");
        gameRole.setDef(30);
        gameRole.setVit(30);

        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到站前");

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
