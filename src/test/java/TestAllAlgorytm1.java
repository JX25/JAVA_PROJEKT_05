import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAlgorytm1ElementsFrom1To100K.class,
        TestAlgorytm1EmptyList.class,
        TestAlgorytm1Example.class,
        TestAlgorytm1NegativeNumbersNoDuplicate.class,
        TestAlgorytm1NotInitializedList.class,
        TestAlgorytm1OneRandomElement.class,
        TestAlgorytm1PositiveNumbersNoDuplicate.class,
        TestAlgorytm1RandomNumbersAndTenZeros.class,
        TestAlgorytm1RandomNumbersWithDuplicates.class,
        TestAlgorytm1SetElementMax.class,
        TestAlgorytm1SetElementMin.class,
        TestAlgorytm1TooManyElements.class
})

public class TestAllAlgorytm1 {
}
