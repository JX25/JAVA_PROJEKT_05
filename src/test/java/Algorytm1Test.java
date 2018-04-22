import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

import static org.junit.Assert.*;

public class Algorytm1Test {


    Algorytm1 alg = new Algorytm1();
    Random rand = new Random();

    @Test
    public void testExample()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(2);
        Assert.assertEquals(5, alg.solution(list));
    }

    @Test
    public void testSetElementMax()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1000000);
        Assert.assertEquals(999999, alg.solution(list));
    }

    @Test
    public void testSetElementMin()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1*1000000);
        Assert.assertEquals(1, alg.solution(list));
    }

    @Test
    public void testOneRandomElement()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer nb = rand.nextInt(2000001) - 1000000;
        list.add(nb);

        try
        {
            if( nb <= 0 ) Assert.assertEquals(1, alg.solution(list));
            else if(nb >1) Assert.assertEquals(nb-1, alg.solution(list));
            else if(nb==1)   Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e)
        {
            String expectedMessage = "Brak najmniejszej liczby naturalnej w podanej liscie!";
            Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
        }
    }

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

         Assert.assertEquals(3, alg.solution(list));
    }

    @Test
    public void testNegativeNumbersNoDuplicate()
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add((rand.nextInt(1000000+1))-1000000);
        Iterator<Integer> it = set.iterator();
        int min = it.next();
        while( set.size() < 100 )
        {
            Integer addingValue = rand.nextInt(1000001) - 1000000;
            if( addingValue> 0 && addingValue < min) min = addingValue;
            set.add(addingValue);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(set);
        Assert.assertEquals(1, alg.solution(list));
    }

    @Test
    public void testRandomNumbersWithDuplicates()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add( rand.nextInt(100000)+1);
        int min = list.get(0);
        for(int i = 0; i < 999; i++)
        {
            int nb = rand.nextInt(1000001)-1000000;
            if( nb > 0 && nb < min ) min = nb;
            list.add(nb);
        }

        try
        {
            if(min > 1) Assert.assertEquals(min-1, alg.solution(list));
            else Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e)
        {
            String expectedMessage = "Brak najmniejszej liczby naturalnej w podanej liscie!";
            Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
        }

    }

    @Test
    public void testRandomNumbersAndTenZeros()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add( rand.nextInt(1000000)+1);
        int min = list.get(0);
        for(int i = 0; i < 999; i++)
        {
            if( i%100 == 0 ) list.add(0);
            int nb = rand.nextInt(1000001)-1000000;
            if( nb == 0 ) continue;
            if( nb > 0 && nb < min ) min = nb;
            list.add(nb);
        }
        try
        {
            if(min > 1) Assert.assertEquals(min-1, alg.solution(list));
            else Assert.fail( "Should have thrown an exception" );
        }
        catch (Exception e)
        {
            String expectedMessage = "Brak najmniejszej liczby naturalnej w podanej liscie!";
            Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
        }
    }

    @Test
    public void testElementsFrom1To100K()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<=100000; i++) list.add(i);

        Assert.assertEquals(list.get(list.size()-1)+1,alg.solution(list));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyList()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        alg.solution(list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotInitializedList()
    {
        //ArrayList<Integer> list;
        alg.solution(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTooManyElements()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<1000000; i++) list.add(rand.nextInt(2000001)-1000000);
        assertEquals("Lista za dluga!", list);
    }


}