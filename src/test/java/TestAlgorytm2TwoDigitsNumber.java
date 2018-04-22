import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2TwoDigitsNumber {

    Algorytm2 alg = new Algorytm2();

    @Test
    public void testTwoDigitsNumber()
    {
        int array[] = new int[2];
        array[0] = 1;
        array[1] = 7;
        assertEquals(10,alg.solution(array));
    }
}
