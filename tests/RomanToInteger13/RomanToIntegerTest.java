package RomanToInteger13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanToIntegerTest {

    @Test
    public void testSingleLetter(){
        assertEquals(RomanToInteger.romanToInt("I"), 1);
    }

    @Test
    public void testMultipleLettersAllSimple(){
        assertEquals(RomanToInteger.romanToInt("LVII"), 57);
    }

    @Test
    public void testMultipleLetters(){
        assertEquals(RomanToInteger.romanToInt("MCDXLIV"), 1444);
    }
}