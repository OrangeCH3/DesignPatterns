package pers.ditto.uml.association;

/**
 * @author OrangeCH3
 * @create 2021-07-09 14:46
 */

// 双向关联
@SuppressWarnings("all")
public class PersonA {
    private IDCardA idCardA;
}

class IDCardA {
    private PersonA personA;
}
