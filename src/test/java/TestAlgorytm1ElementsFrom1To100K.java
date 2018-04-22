import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1ElementsFrom1To100K {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testElementsFrom1To100K()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=100000; i++) list.add(i);

        assertEquals(list.get(list.size()-1)+1,alg.solution(list));
    }
}
