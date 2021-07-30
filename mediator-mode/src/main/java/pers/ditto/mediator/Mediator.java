package pers.ditto.mediator;

/**
 * @author OrangeCH3
 * @create 2021-07-30 9:44
 */

@SuppressWarnings("all")
public abstract class Mediator {

    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}
