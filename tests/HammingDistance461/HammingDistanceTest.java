package HammingDistance461;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 6/14/2018.
 */
public class HammingDistanceTest {

    @Test
    public void TestMultipleDifferences(){
        assertEquals(2, HammingDistance.hammingDistance(4, 1));
        assertEquals(2, HammingDistance.hammingDistance(1, 4));
    }

    @Test
    public void TestNoDifference(){
        assertEquals(0, HammingDistance.hammingDistance(2, 2));
        assertEquals(0, HammingDistance.hammingDistance(626, 626));
    }

    @Test
    public void TestNegativeNumber(){
        assertEquals(32, HammingDistance
                .hammingDistance(-1, 0));
        assertEquals(1, HammingDistance
                .hammingDistance(Integer.MIN_VALUE, 0));
    }

    @Test
    public void TestMultipleDifferencesConcise(){
        assertEquals(2, HammingDistance.hammingDistanceConcise(4, 1));
        assertEquals(2, HammingDistance.hammingDistanceConcise(1, 4));
    }

    @Test
    public void TestNoDifferenceConcise(){
        assertEquals(0, HammingDistance.hammingDistanceConcise(2, 2));
        assertEquals(0, HammingDistance.hammingDistanceConcise(626, 626));
    }

    @Test
    public void TestNegativeNumberConcise(){
        assertEquals(32, HammingDistance
                .hammingDistanceConcise(-1, 0));
        assertEquals(1, HammingDistance
                .hammingDistanceConcise(Integer.MIN_VALUE, 0));
    }
}