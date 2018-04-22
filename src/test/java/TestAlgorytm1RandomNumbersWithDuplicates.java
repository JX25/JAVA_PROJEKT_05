import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1RandomNumbersWithDuplicates {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testRandomNumbersWithDuplicates()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(515);
        list.add(6);
        list.add(515);
        list.add(3921);
        list.add(-2515);
        list.add(-4);
        list.add(-16);
        list.add(8);
        list.add(1);

        assertEquals(2,alg.solution(list));

    }
}
