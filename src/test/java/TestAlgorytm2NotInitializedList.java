import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm2NotInitializedList {

    Algorytm2 alg = new Algorytm2();

    @Test(expected = IllegalArgumentException.class )
    public void testNotInitializedList()
    {
        int array[] = null;
        assertEquals("Niezaincjalizowana lista/tablica", alg.solution(null));
    }

}
