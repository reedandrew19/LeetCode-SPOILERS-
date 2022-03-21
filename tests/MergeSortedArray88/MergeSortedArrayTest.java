package MergeSortedArray88;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void testEmptyArrays(){
        int[] array1 = new int[]{};
        MergeSortedArray.merge(array1, 0, new int[]{}, 0);
        assertTrue(Arrays.equals(new int[]{}, array1));
    }

    @Test
    public void testEmptySecondArray(){
        int[] array1 = new int[]{1};
        MergeSortedArray.merge(array1, 1, new int[]{}, 0);
        assertTrue(Arrays.equals(new int[]{1}, array1));
    }

    @Test
    public void testMergeArrays(){
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        MergeSortedArray.merge(array1, 3, array2, 3);
        assertTrue(Arrays.equals(new int[]{1, 2, 2, 3, 5, 6}, array1));
    }

    @Test
    public void testEmptyArraysBetter(){
        int[] array1 = new int[]{};
        MergeSortedArray.mergeBetter(array1, 0, new int[]{}, 0);
        assertTrue(Arrays.equals(new int[]{}, array1));
    }

    @Test
    public void testEmptySecondArrayBetter(){
        int[] array1 = new int[]{1};
        MergeSortedArray.mergeBetter(array1, 1, new int[]{}, 0);
        assertTrue(Arrays.equals(new int[]{1}, array1));
    }

    @Test
    public void testMergeArraysBetter(){
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        MergeSortedArray.mergeBetter(array1, 3, array2, 3);
        assertTrue(Arrays.equals(new int[]{1, 2, 2, 3, 5, 6}, array1));
    }
}