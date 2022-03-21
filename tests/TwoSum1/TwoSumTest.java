package TwoSum1;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Created by Andrew on 5/22/2018.
 */
public class TwoSumTest {
    @Test
    public void TestPositives(){
        assertEquals(Arrays.toString(new int[] {1, 5}), Arrays.toString(TwoSum
                .TwoSum(new int[]{1, 2, 3, 60, 47, 5}, 7)));
    }

    @Test
    public void TestNegatives(){
        assertEquals(Arrays.toString(new int[] {0, 1}), Arrays.toString(TwoSum
                .TwoSum(new int[]{-3, -5}, -8)));
    }

    @Test
    public void TestNegativeAndPositive(){
        assertEquals(Arrays.toString(new int[]{2, 3}), Arrays.toString(TwoSum
                .TwoSum(new int[]{6, -33, -3, 3, 25}, 0)));
    }

    @Test
    public void TestZero(){
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(TwoSum
                .TwoSum(new int[]{-6, 4, 59, 0}, 4)));
    }

    @Test
    public void TestSameNumber(){
        assertEquals(Arrays.toString(new int[]{1,2}), Arrays.toString(TwoSum
                .TwoSum(new int[]{0, 4, 4}, 8)));
    }

    @Test
    public void TestPositivesBetter(){
        assertEquals(Arrays.toString(new int[] {1, 5}), Arrays.toString(TwoSum
                .BetterTwoSum(new int[]{1, 2, 3, 60, 47, 5}, 7)));
    }

    @Test
    public void TestNegativesBetter(){
        assertEquals(Arrays.toString(new int[] {0, 1}), Arrays.toString(TwoSum
                .BetterTwoSum(new int[]{-3, -5}, -8)));
    }

    @Test
    public void TestNegativeAndPositiveBetter(){
        assertEquals(Arrays.toString(new int[]{2, 3}), Arrays.toString(TwoSum
                .BetterTwoSum(new int[]{6, -33, -3, 3, 25}, 0)));
    }

    @Test
    public void TestZeroBetter(){
        assertEquals(Arrays.toString(new int[]{1, 3}), Arrays.toString(TwoSum
                .BetterTwoSum(new int[]{-6, 4, 59, 0}, 4)));
    }

    @Test
    public void TestSameNumberBetter(){
        assertEquals(Arrays.toString(new int[]{1,2}), Arrays.toString(TwoSum
                .BetterTwoSum(new int[]{0, 4, 4}, 8)));
    }
}

