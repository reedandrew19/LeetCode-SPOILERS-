package MissingNumber268;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MissingNumberTest {
    @Test
    public void assertArrayOneElement(){
        assertEquals(1, MissingNumber.missingNumber(new int[]{0}));
    }

    @Test
    public void assertArray(){
        assertEquals(8, MissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    @Test
    public void assertArrayOneElementBitManipulation(){
        assertEquals(1, MissingNumber.missingNumberBitManipulation(new int[]{0}));
    }

    @Test
    public void assertArrayBitManipulation(){
        assertEquals(8, MissingNumber.missingNumberBitManipulation(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}