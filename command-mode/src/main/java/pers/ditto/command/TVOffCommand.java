package pers.ditto.command;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:13
 */

@SuppressWarnings("all")
public class TVOffCommand implements Command{

    // 聚合TVReceiver
    TVReceiver tv;

    // 构造器
    public TVOffCommand(TVReceiver tv) {
        super();
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
