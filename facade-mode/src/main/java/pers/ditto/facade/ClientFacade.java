package pers.ditto.facade;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-20 16:57
 */

@SuppressWarnings("all")
public class ClientFacade {

    @Test
    public void testFacade() {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
