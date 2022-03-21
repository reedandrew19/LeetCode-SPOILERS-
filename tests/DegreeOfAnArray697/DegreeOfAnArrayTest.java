package DegreeOfAnArray697;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DegreeOfAnArrayTest {

    @Test
    public void testOneValueArray(){
        assertEquals(1, DegreeOfAnArray.findDegreeOfArray(new int[]{-2}));
    }

    @Test
    public void testMultipleMaxOccurrences(){
        assertEquals(4, DegreeOfAnArray.findDegreeOfArray(new int[]{-100, 4, 6, -100, 4}));
    }

    @Test
    public void testMultipleNonMaxOccurrences(){
        assertEquals(2, DegreeOfAnArray.findDegreeOfArray(new int[]{-100, 4, 4, 6}));
    }
}