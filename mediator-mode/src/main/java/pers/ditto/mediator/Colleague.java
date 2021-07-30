package pers.ditto.mediator;

/**
 * @author OrangeCH3
 * @create 2021-07-30 9:44
 */

@SuppressWarnings("all")
public abstract class Colleague {

    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {

        this.mediator = mediator;
        this.name = name;

    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
