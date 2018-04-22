import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2TooLongNumber {
    Algorytm2 alg = new Algorytm2();

    @Test(expected = IllegalArgumentException.class )
    public void testTooLongNumber()
    {
        int array[] = new int[200];
        for(int i=0; i< 200; i++)
        {
            array[i] = 3;
        }
        assertEquals(null, alg.solution(array));
    }
}
