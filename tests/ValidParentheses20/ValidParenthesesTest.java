package ValidParentheses20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void testBracketsNotClosed(){
        assertFalse(ValidParentheses.isValid("()[]{}[]{[](([]{}))"));
    }

    @Test
    public void testWrongClosingBracket(){
        assertFalse(ValidParentheses.isValid("[{}(([)])]"));
    }

    @Test
    public void testTooManyClosingBrackets(){
        assertFalse(ValidParentheses.isValid("{})"));
    }

    @Test
    public void testNestedBrackets(){
        assertTrue(ValidParentheses.isValid("{[]([[[{}({}[])]]][(())]{})}"));
    }

    @Test
    public void testBracketsNotClosedCleaner(){
        assertFalse(ValidParentheses.isValidCleaner("()[]{}[]{[](([]{}))"));
    }

    @Test
    public void testWrongClosingBracketCleaner(){
        assertFalse(ValidParentheses.isValidCleaner("[{}(([)])]"));
    }

    @Test
    public void testTooManyClosingBracketsCleaner(){
        assertFalse(ValidParentheses.isValidCleaner("{})"));
    }

    @Test
    public void testNestedBracketsCleaner(){
        assertTrue(ValidParentheses.isValidCleaner("{[]([[[{}({}[])]]][(())]{})}"));
    }
}