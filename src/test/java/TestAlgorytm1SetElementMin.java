import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1SetElementMin {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testSetElementMin()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1*1000000);
        assertEquals(1, alg.solution(list));
    }
}
