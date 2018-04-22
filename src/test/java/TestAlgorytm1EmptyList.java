import org.junit.Test;

import java.util.ArrayList;

public class TestAlgorytm1EmptyList {

    Algorytm1 alg = new Algorytm1();

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        alg.solution(list);
    }
}
