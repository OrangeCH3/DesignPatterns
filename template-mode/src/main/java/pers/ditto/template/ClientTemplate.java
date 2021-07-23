package pers.ditto.template;

import org.junit.Test;

/**
 * @author OrangeCH3
 * @create 2021-07-23 10:51
 */

@SuppressWarnings("all")
public class ClientTemplate {

    @Test
    public void testTemplate() {

        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
        System.out.println();

        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println();

        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
