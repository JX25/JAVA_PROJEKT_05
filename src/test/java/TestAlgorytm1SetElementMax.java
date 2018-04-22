import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1SetElementMax {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testSetElementMax()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1000000);
        assertEquals(1, alg.solution(list));
    }

}
