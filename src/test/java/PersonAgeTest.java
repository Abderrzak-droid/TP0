import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonAgeTest
{
@Test
    void FirstNameOnlyFirstLetterInCapital(){
        //Arrange
        Person p = new Person("BOUDRA","Brahim",22);

        //Act
        String Fullname = p.getFullName();

        //Assert
        Assertions.assertEquals("Boudra Brahim",Fullname);
    }
@Test
    void FullNameFirstNameInCapital(){
        //Arrange
        Person p = new Person("BOUDRA","Brahim",22);

        //Act
        String Fullname = p.getFullName();

        //Assert
        Assertions.assertEquals("BOUDRA Brahim",Fullname);
    }

    @Test
    void isAdultShouldReturnTrueIfAgeIsGreaterTo18(){
        //Arrange
        Person p = new Person("BOUDRA","Brahim",22);

        //Act
        boolean isAdult = p.isAdult();

        //Assert
        Assertions.assertEquals(true,isAdult);
    }
    @Test
    void isAdultShouldReturnFalseIfAgeIsLessTo18(){
        //Arrange
        Person p = new Person("BOUDRA","Brahim",22);

        //Act
        boolean isAdult = p.isAdult();

        //Assert
        Assertions.assertEquals(false,isAdult);
    }
}
