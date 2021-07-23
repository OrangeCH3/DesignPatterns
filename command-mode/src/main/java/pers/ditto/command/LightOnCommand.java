package pers.ditto.command;

/**
 * @author OrangeCH3
 * @create 2021-07-23 16:01
 */

@SuppressWarnings("all")
public class LightOnCommand implements Command{

    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
