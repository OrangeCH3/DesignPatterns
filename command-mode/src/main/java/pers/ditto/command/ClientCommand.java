package pers.ditto.command;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:07
 */

@SuppressWarnings("all")
public class ClientCommand {

    @Test
    public void testCommand() {

        //使用命令设计模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("按下电灯打开按钮 →");
        remoteController.onButtonWasPushed(0);
        System.out.println("按下电灯关闭按钮 →");
        remoteController.offButtonWasPushed(0);
        System.out.println("按下电灯撤销按钮 →");
        remoteController.undoButtonWasPushed();
        System.out.println();

        // 功能扩展也很容易，只需要增加XXOffCommand, XXOnCommand, XXReceiver即可
        TVReceiver tvReceiver = new TVReceiver();

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        //给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("按下电视打开按钮 →");
        remoteController.onButtonWasPushed(1);
        System.out.println("按下电视关闭按钮 →");
        remoteController.offButtonWasPushed(1);
        System.out.println("按下电视撤销按钮 →");
        remoteController.undoButtonWasPushed();
    }
}
