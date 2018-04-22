import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1RandomNumbersAndTenZeros {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testRandomNumbersAndTenZeros()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for( int i = 0; i< 10; i++) list.add(0);
        list.add(16);
        list.add(-16);
        list.add(51);
        list.add(-351);
        list.add(660);
        list.add(-3);
        list.add(72);
        assertEquals(15,alg.solution(list));
    }

}
