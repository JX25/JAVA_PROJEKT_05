import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1TooManyElements {


    @Test(expected = IllegalArgumentException.class)
    public void testTooManyElements()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<1000000; i++) list.add(i);
        assertEquals("Lista za dluga!", list);
    }
}
