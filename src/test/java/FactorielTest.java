import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorielTest {
    @Test
    void shouldReturnExceptionIfNumberIsNegative(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> new Factoriel().factorial(-5));
    }

    @Test
    void shouldReturn1IfTheNumberIs0Or1(){
        Assertions.assertEquals(1,new Factoriel().factorial(0));
        Assertions.assertEquals(1,new Factoriel().factorial(1));
    }

    @Test
    void shouldReturnTheCorrectValue() {
        Assertions.assertEquals(120, new Factoriel().factorial(5));
    }
}
