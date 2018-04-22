import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;
import static org.junit.Assert.*;

public class Algorytm2Test {

    Algorytm2 alg = new Algorytm2();
    Random rand = new Random();


    @Test
    public void testPositiveNumber()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(1);
        assertEquals(9,alg.solution(list));
    }

    @Test
    public void testTwoDigitsNumber()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        assertEquals(10,alg.solution(list));
    }

    @Test
    public void testNegativeNumber()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(-1);

        assertEquals(9,alg.solution(list));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testTwoNegativeDigits()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(-5);
        list.add(-1);

        assertEquals(null,alg.solution(list));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testNotInitializedList()
    {
        assertEquals(null, alg.solution(null));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testEmptyList()
    {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        assertEquals(null, alg.solution(list));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testNumberInsteadOfDigit()
    {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        list.add(6);
        list.add(2);
        list.add(11);
        assertEquals(null, alg.solution(list));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testZeroAtTheBegining()
    {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(0);
        assertEquals(null, alg.solution(list));
    }

    @Test(expected = IllegalArgumentException.class )
    public void testTooLongNumber()
    {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        for(int i=0; i< 200; i++) list.add( rand.nextInt(10));
        list.add(6);
        assertEquals(null, alg.solution(list));
    }


}
