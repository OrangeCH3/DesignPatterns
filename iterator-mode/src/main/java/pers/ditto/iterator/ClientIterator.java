package pers.ditto.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OrangeCH3
 * @create 2021-07-28 16:46
 */

@SuppressWarnings("all")
public class ClientIterator {

    @Test
    public void testIterator() {

        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
