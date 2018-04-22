import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2TwoNegativeDigits {

    Algorytm2 alg = new Algorytm2();

    @Test(expected = IllegalArgumentException.class )
    public void testTwoNegativeDigits()
    {
        int array[] = new int[3];
        array[0] = 3;
        array[1] = -5;
        array[2] = -1;

        assertEquals(null,alg.solution(array));
    }
}
