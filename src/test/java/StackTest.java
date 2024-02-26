import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    Stack pile;
    @BeforeEach
    void SetUp() {
         this.pile = new Stack();
    }

@Test
    void pushShouldLetUsAddElements(){

        pile.push(4);
        int size = pile.size();
        Assertions.assertEquals(4,pile.peek());
        Assertions.assertEquals(1,size);
    }

    @Test
    void pushShouldExpandArrayIfStackIsFull(){

    for(int i=0;i<10;i++)
        pile.push(i);


    Assertions.assertEquals(10,pile.size());
    pile.push(10);
    Assertions.assertEquals(11,pile.size());
    Assertions.assertEquals(10,pile.peek());
    }


}
