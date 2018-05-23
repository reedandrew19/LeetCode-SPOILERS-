package TwoSum1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 5/22/2018.
 */
public class TwoSum1Test {
    @Test
    public void TestPositives(){
        assertEquals(new int[] {1, 5}, TwoSum1.TwoSum(new int[]{1, 2, 3, 60,
                47, 5}, 7));
    }

    @Test
    public void TestNegatives(){
        assertEquals(new int[] {0, 1}, TwoSum1.TwoSum(new int[]{-3, -5}, -8));
    }

    @Test
    public void TestNegativeAndPositive(){
        assertEquals(new int[]{2, 3}, TwoSum1.TwoSum(new int[]{6, -33, -3, 3,
                25}, 0));
    }

    @Test
    public void TestZero(){
        assertEquals(new int[]{1, 3}, TwoSum1.TwoSum(new int[]{-6, 4, 59, 0},
                4));
    }

    @Test
    public void TestSameNumber(){
        assertEquals(new int[]{1,2}, TwoSum1.TwoSum(new int[]{0, 4, 4}, 8));
    }
}