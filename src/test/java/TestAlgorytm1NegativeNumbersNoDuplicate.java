import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1NegativeNumbersNoDuplicate {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testNegativeNumbersNoDuplicate()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1222);
        list.add(-2414);
        list.add(-690);
        list.add(-553);
        list.add(-22);
        list.add(-1);
        list.add(-533333);
        list.add(-935);
        assertEquals(1, alg.solution(list));
    }

}
