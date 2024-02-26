
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
      //Arrange
        RomanNumeral roman = new RomanNumeral();
      //Act
        int result = roman.convert("I");
// Assert
        Assertions.assertEquals(1, result);
    }

}