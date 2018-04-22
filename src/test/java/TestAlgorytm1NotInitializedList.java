import org.junit.Test;

public class TestAlgorytm1NotInitializedList {

    Algorytm1 alg = new Algorytm1();

    @Test(expected = IllegalArgumentException.class)
    public void testNotInitializedList()
    {
        //ArrayList<Integer> list;
        alg.solution(null);
    }

}
