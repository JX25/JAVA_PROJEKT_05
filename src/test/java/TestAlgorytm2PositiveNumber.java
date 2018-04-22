import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2PositiveNumber {

    Algorytm2 alg = new Algorytm2();

    @Test
    public void testPositiveNumber()
    {
        int array[] = new int[3];
        array[0] = 3;
        array[1] = 5;
        array[2] = 1;
        assertEquals(9,alg.solution(array));
    }
}
