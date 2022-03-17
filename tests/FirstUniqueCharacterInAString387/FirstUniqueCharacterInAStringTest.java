package FirstUniqueCharacterInAString387;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInAStringTest {
    @Test
    public void testEmptyString(){
        assertEquals(-1, FirstUniqueCharacterInAString.firstUniqChar(""));
    }

    @Test
    public void testOnlyOneLetter(){
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqChar("s"));
    }

    @Test
    public void testFirstLetterOnlyUnique(){
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqChar("akkll"));
    }

    @Test
    public void testFirstLetterNotOnlyUnique(){
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqChar("akkllg"));
    }

    @Test
    public void testUniqueLetterInMiddle(){
        assertEquals(3, FirstUniqueCharacterInAString.firstUniqChar("ddfkfuud"));
    }

    @Test
    public void testNoUniqueLetter(){
        assertEquals(-1, FirstUniqueCharacterInAString.firstUniqChar("asdrfjklasdrfjkl"));
    }
}