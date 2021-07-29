package pers.ditto.observer;


/**
 * @author OrangeCH3
 * @create 2021-07-29 10:12
 */

@SuppressWarnings("all")
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
