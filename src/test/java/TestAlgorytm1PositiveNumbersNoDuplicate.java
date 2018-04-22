import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestAlgorytm1PositiveNumbersNoDuplicate {

    Algorytm1 alg = new Algorytm1();

    @Test
    public void testPositiveNumbersNoDuplicate()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(16);
        list.add(122);
        list.add(131516);
        list.add(26);
        list.add(1633);
        list.add(86);
        list.add(556);
        list.add(216);
        list.add(400);
        list.add(1);
        list.add(2);
        list.add(99);
        list.add(11);

        assertEquals(3, alg.solution(list));
    }
}
