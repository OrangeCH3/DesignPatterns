package pers.ditto.observer;

/**
 * @author OrangeCH3
 * @create 2021-07-29 10:13
 */

@SuppressWarnings("all")
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
