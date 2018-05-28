package LongestSubstringWithoutRepeatingCharacters3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 5/27/2018.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void TestNoRepeats(){
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters
                .LongestSubstringWithoutRepeatingCharacters("a"));
        assertEquals(7, LongestSubstringWithoutRepeatingCharacters
                .LongestSubstringWithoutRepeatingCharacters("bacdpql"));
    }

    @Test
    public void TestEmptyString(){
        assertEquals(0, LongestSubstringWithoutRepeatingCharacters
        .LongestSubstringWithoutRepeatingCharacters(""));
    }

    @Test
    public void AllSameLetter(){
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters
        .LongestSubstringWithoutRepeatingCharacters("bbbbbbb"));
    }

    @Test
    public void TestRepeatsNoOverlapping(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .LongestSubstringWithoutRepeatingCharacters("abcabcabc"));
    }

    @Test
    public void TestRepeatsOverLapping(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .LongestSubstringWithoutRepeatingCharacters("abcabcbb"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .LongestSubstringWithoutRepeatingCharacters("pwwkew"));
    }

    @Test
    public void TestIdunno(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .LongestSubstringWithoutRepeatingCharacters("dvdf"));
        assertEquals(2, LongestSubstringWithoutRepeatingCharacters
                .LongestSubstringWithoutRepeatingCharacters("abba"));
    }
}