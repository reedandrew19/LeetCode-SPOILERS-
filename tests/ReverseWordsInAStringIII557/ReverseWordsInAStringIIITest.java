package ReverseWordsInAStringIII557;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseWordsInAStringIIITest {
    @Test
    public void testEmptyString(){
        assertEquals("", ReverseWordsInAStringIII.reverseWords(""));
    }

    @Test
    public void testSingleWord(){
        assertEquals("olleh", ReverseWordsInAStringIII.reverseWords("hello"));
    }

    @Test
    public void testSingleLetterWords(){
        assertEquals("a b q l", ReverseWordsInAStringIII.reverseWords("a b q l"));
    }

    @Test
    public void testReverseWords(){
        assertEquals("Dude my name is McGillicutty",
                ReverseWordsInAStringIII.reverseWords("eduD ym eman si yttucilliGcM"));
    }
}