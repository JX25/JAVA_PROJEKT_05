import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2ZeroAtTheBegining {

    Algorytm2 alg = new Algorytm2();

    @Test(expected = IllegalArgumentException.class )
    public void testZeroAtTheBegining()
    {
        int array[] = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 1;
        array[3] = 0;
        assertEquals(null, alg.solution(array));
    }
}
