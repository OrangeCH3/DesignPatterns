package pers.ditto.uml.composition;

/**
 * @author OrangeCH3
 * @create 2021-07-09 15:16
 */

@SuppressWarnings("all")
public class PersonMix {

    private IDCardMix card;
    private HeadMix head = new HeadMix();
}

class IDCardMix {}

class HeadMix {}
