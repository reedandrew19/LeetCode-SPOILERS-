package UniqueNumberOfOccurrences1207;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {
    @Test
    public void testSingleValueArray(){
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{1}));
    }

    @Test
    public void testNoCommonOccurrences(){
        assertTrue(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{3, 4, 7, 4, 7, 7}));
    }

    @Test
    public void testCommonOccurrence(){
        assertFalse(UniqueNumberOfOccurrences.uniqueOccurrences(new int[]{3, 4, 7, 4, 7}));
    }
}