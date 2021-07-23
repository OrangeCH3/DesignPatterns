package pers.ditto.command;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:15
 */

@SuppressWarnings("all")
public class TVOnCommand implements Command {

    // 聚合TVReceiver
    TVReceiver tv;

    // 构造器
    public TVOnCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
