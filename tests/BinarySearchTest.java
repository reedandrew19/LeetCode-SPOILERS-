import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    public void testSingleValueArrayTargetPresent(){
        assertEquals(0, BinarySearch.search(new int[]{1}, 1));
    }

    @Test
    public void testSingleValueArrayTargetNotPresent(){
        assertEquals(-1, BinarySearch.search(new int[]{2}, 1));
    }

    @Test
    public void testEvenLengthArrayTargetPresent(){
        assertEquals(4, BinarySearch.search(new int[]{1, 4, 8, 15, 16, 32}, 16));
    }

    @Test
    public void testEvenLengthArrayTargetNotPresent(){
        assertEquals(-1, BinarySearch.search(new int[]{1, 4, 8, 15, 16, 32}, 17));
    }

    @Test
    public void testOddLengthArrayTargetPresent(){
        assertEquals(1, BinarySearch.search(new int[]{-100, -45, 0, 16, 3354}, -45));
    }

    @Test
    public void testOddLengthArrayTargetNotPresent(){
        assertEquals(-1, BinarySearch.search(new int[]{-100, -45, 0, 16, 3354}, -53));
    }

    @Test
    public void testSingleValueArrayTargetPresentRecursive(){
        assertEquals(0, BinarySearch.searchRecursive(new int[]{1}, 1));
    }

    @Test
    public void testSingleValueArrayTargetNotPresentRecursive(){
        assertEquals(-1, BinarySearch.searchRecursive(new int[]{2}, 1));
    }

    @Test
    public void testEvenLengthArrayTargetPresentRecursive(){
        assertEquals(4, BinarySearch.searchRecursive(new int[]{1, 4, 8, 15, 16, 32}, 16));
    }

    @Test
    public void testEvenLengthArrayTargetNotPresentRecursive(){
        assertEquals(-1, BinarySearch.searchRecursive(new int[]{1, 4, 8, 15, 16, 32}, 17));
    }

    @Test
    public void testOddLengthArrayTargetPresentRecursive(){
        assertEquals(1, BinarySearch.searchRecursive(new int[]{-100, -45, 0, 16, 3354}, -45));
    }

    @Test
    public void testOddLengthArrayTargetNotPresentRecursive(){
        assertEquals(-1, BinarySearch.searchRecursive(new int[]{-100, -45, 0, 16, 3354}, -53));
    }
}