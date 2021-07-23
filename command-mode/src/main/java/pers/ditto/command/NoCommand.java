package pers.ditto.command;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:04
 */

// 用于初始化每个按钮, 当调用空命令时，对象什么都不做
// 也算是一种设计模式, 可以省掉对空判断
@SuppressWarnings("all")
public class NoCommand implements Command{
    @Override
    public void execute() {
        // 空实现
    }

    @Override
    public void undo() {
        // 空实现
    }
}
