import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2NumberInsteadOfDigit {

    Algorytm2 alg = new Algorytm2();

    @Test(expected = IllegalArgumentException.class )
    public void testNumberInsteadOfDigit()
    {
        int array[] = new int[3];
        array[0] = 6;
        array[1] = 2;
        array[2] = 10;

        assertEquals(null, alg.solution(array));
    }
}
