import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2EmptyList {

    Algorytm2 alg = new Algorytm2();

    @Test(expected = IllegalArgumentException.class )
    public void testEmptyList()
    {
        int array[] = new int[3];
        assertEquals("Lista jest pusta", alg.solution(array));
    }

}
