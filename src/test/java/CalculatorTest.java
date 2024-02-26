import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class CalculatorTest {
    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
// Arrange
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;
// Act
        int result = calculator.add(a, b);
// Assert
        Assertions.assertEquals(5, result);
    }

}