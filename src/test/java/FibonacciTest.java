import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void ShouldReturnExceptionIfNumberIsLessThan0(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Fibonacci.fibonacci(-10));

    }

    @Test
    void ShouldReturn0IfTheNumberIs0(){

        Assertions.assertEquals( 0 , Fibonacci.fibonacci(0));
    }
    @Test
    void ShouldReturn1IfTheNumberIs1(){
        Assertions.assertEquals(1,Fibonacci.fibonacci(1));
    }

    @Test
    void ShouldReturnTheCorrectValue(){
        Assertions.assertEquals(55,Fibonacci.fibonacci(10));
    }
}
