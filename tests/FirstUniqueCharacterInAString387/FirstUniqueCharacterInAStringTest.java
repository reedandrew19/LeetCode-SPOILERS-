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

    @Test
    public void testEmptyStringArray(){
        assertEquals(-1, FirstUniqueCharacterInAString.firstUniqCharArray(""));
    }

    @Test
    public void testOnlyOneLetterArray(){
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqCharArray("s"));
    }

    @Test
    public void testFirstLetterOnlyUniqueArray(){
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqCharArray("akkll"));
    }

    @Test
    public void testFirstLetterNotOnlyUniqueArray(){
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqCharArray("akkllg"));
    }

    @Test
    public void testUniqueLetterInMiddleArray(){
        assertEquals(3, FirstUniqueCharacterInAString.firstUniqCharArray("ddfkfuud"));
    }

    @Test
    public void testNoUniqueLetterArray(){
        assertEquals(-1, FirstUniqueCharacterInAString.firstUniqCharArray("asdrfjklasdrfjkl"));
    }
}