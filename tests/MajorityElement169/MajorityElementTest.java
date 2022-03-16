package MajorityElement169;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest{
    @Test
    public void testOnlyOneNum(){
        assertEquals(MajorityElement.majorityElement(new int[]{1}), 1);
    }

    @Test
    public void testMajorityTwoValues(){
        assertEquals(MajorityElement.majorityElement(new int[]{3, 4, 3}), 3);
    }

    @Test
    public void testNegativeNumbers(){
        assertEquals(MajorityElement.majorityElement(new int[]{-4, 2, -4}), -4);
    }

    @Test
    public void testOnlyOneNumBetter(){
        assertEquals(MajorityElement.majorityElement(new int[]{1}), 1);
    }

    @Test
    public void testMajorityTwoValuesBetter(){
        assertEquals(MajorityElement.majorityElement(new int[]{3, 4, 3}), 3);
    }

    @Test
    public void testNegativeNumbersBetter(){
        assertEquals(MajorityElement.majorityElement(new int[]{-4, 2, -4}), -4);
    }
}