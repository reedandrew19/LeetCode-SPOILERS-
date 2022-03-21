package PalindromeNumber2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeNumberTest {
    @Test
    public void testSingleDigit(){
        assertEquals(PalindromeNumber.isPalindrome(1), true);
    }

    @Test
    public void testEvenNumberOfDigitsPass(){
        assertEquals(PalindromeNumber.isPalindrome(1221), true);
    }

    @Test
    public void testEvenNumberOfDigitsFail(){
        assertEquals(PalindromeNumber.isPalindrome(1231), false);
    }

    @Test
    public void testOddNumberOfDigitsPass(){
        assertEquals(PalindromeNumber.isPalindrome(39693), true);
    }

    @Test
    public void testOddNumberOfDigitsFail(){
        assertEquals(PalindromeNumber.isPalindrome(56856), false);
    }

    @Test
    public void testSingleDigitBetter(){
        assertEquals(PalindromeNumber.isPalindromeBetter(1), true);
    }

    @Test
    public void testEvenNumberOfDigitsPassBetter(){
        assertEquals(PalindromeNumber.isPalindromeBetter(1221), true);
    }

    @Test
    public void testEvenNumberOfDigitsFailBetter(){
        assertEquals(PalindromeNumber.isPalindromeBetter(1231), false);
    }

    @Test
    public void testOddNumberOfDigitsPassBetter(){
        assertEquals(PalindromeNumber.isPalindromeBetter(39693), true);
    }

    @Test
    public void testOddNumberOfDigitsFailBetter(){
        assertEquals(PalindromeNumber.isPalindromeBetter(56856), false);
    }
}