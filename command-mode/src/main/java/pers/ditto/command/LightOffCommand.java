package pers.ditto.command;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:03
 */

@SuppressWarnings("all")
public class LightOffCommand implements Command{

    // 聚合LightReceiver
    LightReceiver light;

    // 构造器
    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
