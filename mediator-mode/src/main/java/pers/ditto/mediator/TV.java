package pers.ditto.mediator;

/**
 * @author OrangeCH3
 * @create 2021-07-30 9:51
 */

@SuppressWarnings("all")
public class TV extends Colleague{

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartTv() {
        System.out.println("It's time to StartTV!");
    }

    public void StopTv() {
        System.out.println("StopTV!");
    }
}
