package FindTheDifference389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {

    @Test
    public void testEmptyFirstString(){
        assertEquals('a', FindTheDifference.findTheDifference("", "a"));
    }

    @Test
    public void testAddedLetterNoDuplicates(){
        assertEquals('t', FindTheDifference.findTheDifference("asdfjkl", "aftjksdl"));
    }

    @Test
    public void testAddedLetterDuplicates(){
        assertEquals('v', FindTheDifference.findTheDifference("ssjuljowqvj", "lvjowqvjssju"));
    }
    
    @Test
    public void testEmptyFirstStringArray(){
        assertEquals('a', FindTheDifference.findTheDifferenceArray("", "a"));
    }

    @Test
    public void testAddedLetterNoDuplicatesArray(){
        assertEquals('t', FindTheDifference.findTheDifferenceArray("asdfjkl", "aftjksdl"));
    }

    @Test
    public void testAddedLetterDuplicatesArray(){
        assertEquals('v', FindTheDifference.findTheDifferenceArray("ssjuljowqvj", "lvjowqvjssju"));
    }
}