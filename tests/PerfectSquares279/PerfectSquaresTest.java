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
    public void TestNotLargestSquaresSmallestSequenceMem() {
        assertEquals(PerfectSquares.perfectSquaresMem(12), 3);
        assertEquals(PerfectSquares.perfectSquaresMem(18), 2);
    }

    public void TestBetterOnlyOnes(){
        assertEquals(1, PerfectSquares.betterPerfectSquaresTab(1));
        assertEquals(2, PerfectSquares.betterPerfectSquaresTab(2));
        assertEquals(3, PerfectSquares.betterPerfectSquaresTab(3));
    }

    @Test
    public void TestBetterPerfectSquares(){
        assertEquals(1, PerfectSquares.betterPerfectSquaresTab(4));
        assertEquals(1, PerfectSquares.betterPerfectSquaresTab(9));
        assertEquals(1, PerfectSquares.betterPerfectSquaresTab(16));
    }

    @Test
    public void TestBetterLargestSquaresSmallestSequence(){
        assertEquals(2, PerfectSquares.betterPerfectSquaresTab(10));
        assertEquals(2, PerfectSquares.betterPerfectSquaresTab(13));
    }

    @Test
    public void TestBetterNotLargestSquaresSmallestSequence(){
        assertEquals(3, PerfectSquares.betterPerfectSquaresTab(12));
        assertEquals(2, PerfectSquares.betterPerfectSquaresTab(18));
    }
}