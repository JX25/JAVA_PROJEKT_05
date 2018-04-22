import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1OneRandomElement {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testOneRandomElement()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(51315);
        // list.add(-53131);
        // list.add(1);
        // list.add(0);

        assertEquals(1,alg.solution(list));
    }
}
