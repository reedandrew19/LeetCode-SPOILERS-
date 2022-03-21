package LongestSubstringWithoutRepeatingCharacters3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by Andrew on 5/27/2018.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void TestNoRepeats(){
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstring("a"));
        assertEquals(7, LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstring("bacdpql"));
    }

    @Test
    public void TestEmptyString(){
        assertEquals(0, LongestSubstringWithoutRepeatingCharacters
        .lengthOfLongestSubstring(""));
    }

    @Test
    public void AllSameLetter(){
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters
        .lengthOfLongestSubstring("bbbbbbb"));
    }

    @Test
    public void TestRepeatsNoOverlapping(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .lengthOfLongestSubstring("abcabcabc"));
    }

    @Test
    public void TestRepeatsOverLapping(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void TestIdunno(){
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters
        .lengthOfLongestSubstring("dvdf"));
        assertEquals(2, LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstring("abba"));
    }
}