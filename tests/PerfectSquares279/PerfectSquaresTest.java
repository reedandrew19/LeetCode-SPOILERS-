package PerfectSquares279;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew on 5/16/2018.
 */
public class PerfectSquaresTest {

    @Test
    public void TestOnlyOnes(){
        assertEquals(PerfectSquares.perfectSquares(1), 1);
        assertEquals(PerfectSquares.perfectSquares(2), 2);
        assertEquals(PerfectSquares.perfectSquares(3), 3);
    }

    @Test
    public void TestPerfectSquares(){
        assertEquals(PerfectSquares.perfectSquares(4), 1);
        assertEquals(PerfectSquares.perfectSquares(9), 1);
        assertEquals(PerfectSquares.perfectSquares(16), 1);
    }

    @Test
    public void TestLargestSquaresSmallestSequence(){
        assertEquals(PerfectSquares.perfectSquares(10), 2);
        assertEquals(PerfectSquares.perfectSquares(13), 2);
    }

    @Test
    public void TestNotLargestSquaresSmallestSequence(){
        assertEquals(PerfectSquares.perfectSquares(12), 3);
        assertEquals(PerfectSquares.perfectSquares(18), 2);
    }

    @Test
    public void TestOnlyOnesMem() {
        assertEquals(PerfectSquares.perfectSquaresMem(1), 1);
        assertEquals(PerfectSquares.perfectSquaresMem(2), 2);
        assertEquals(PerfectSquares.perfectSquaresMem(3), 3);
    }

    @Test
    public void TestPerfectSquaresMem(){
        assertEquals(PerfectSquares.perfectSquaresMem(4), 1);
        assertEquals(PerfectSquares.perfectSquaresMem(9), 1);
        assertEquals(PerfectSquares.perfectSquaresMem(16), 1);
    }

    @Test
    public void TestLargestSquaresSmallestSequenceMem(){
        assertEquals(PerfectSquares.perfectSquaresMem(10), 2);
        assertEquals(PerfectSquares.perfectSquaresMem(13), 2);
    }

    @Test
    public void TestNotLargestSquaresSmallestSequenceMem(){
        assertEquals(PerfectSquares.perfectSquaresMem(12), 3);
        assertEquals(PerfectSquares.perfectSquaresMem(18), 2);
    }
}