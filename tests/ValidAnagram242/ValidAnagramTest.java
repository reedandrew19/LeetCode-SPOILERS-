package ValidAnagram242;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ValidAnagramTest {
    @Test
    public void testOneEmptyString(){
        assertFalse(ValidAnagram.isAnagram("", "a"));
        assertFalse(ValidAnagram.isAnagram("a", ""));
    }

    @Test
    public void testIdenticalStrings(){
        assertTrue(ValidAnagram.isAnagram("Hello, my name is Andrew", "Hello, my name is Andrew"));
    }

    @Test
    public void testValidAnagram(){
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void notValidAnagram(){
        assertFalse(ValidAnagram.isAnagram("rat", "car"));
    }
}