import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    void shouldReturnTrueiftheNumberIsGreaterThan2AndIsPrime(){
        Assertions.assertEquals(true,new Prime().isPrime(3));
    }

    @Test
    void shouldReturnFalseIfTheNumberIsGreaterThan2AndIsNotPrime(){
        Assertions.assertEquals(false,new Prime().isPrime(4));
    }

    @Test
    void shouldRetrunFalseIfTheNumberIsLessThan2(){
        Assertions.assertEquals(false,new Prime().isPrime(1));
    }
}

