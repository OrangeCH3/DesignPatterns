package pers.ditto.command;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:00
 */

@SuppressWarnings("all")
public interface Command {

    //执行动作(操作)
    public void execute();

    //撤销动作(操作)
    public void undo();
}
