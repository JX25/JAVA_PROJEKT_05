import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1Example {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testExample()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(2);
        assertEquals(5, alg.solution(list));
    }
}
