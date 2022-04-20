package isSubsequence392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequencecTest {

    @Test
    public void testNonEmptyOtherStringEmptySubsequence(){
        assertTrue(IsSubsequence.isSubsequence("", "asdox"));
    }

    @Test
    public void testEmptyOtherStringNonEmptySubsequence(){
        assertFalse(IsSubsequence.isSubsequence("alicis", ""));
    }

    @Test
    public void testEmptyOtherStringEmptySubsequence(){
        assertTrue(IsSubsequence.isSubsequence("", ""));
    }

    @Test
    public void testSubsequenceEqualsOtherString(){
        assertTrue(IsSubsequence.isSubsequence("laskdjf", "laskdjf"));
    }

    @Test
    public void NotSubsequence(){
        assertFalse(IsSubsequence.isSubsequence("aipl", "alyoipisse"));
    }

    @Test
    public void testIsSubsequence(){
        assertTrue(IsSubsequence.isSubsequence("aipl", "alyoipisseli"));
    }
}