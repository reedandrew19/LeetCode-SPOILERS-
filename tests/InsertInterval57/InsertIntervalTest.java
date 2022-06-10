package InsertInterval57;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @Test
    public void insertIntoEmptyIntervalsList(){
        assertArrayEquals(new int[][] {new int []{0, 3}}, InsertInterval.insert(new int[][]{}, new int[]{0, 3}));
    }

    @Test
    public void insertInBetweenOneInterval(){
        assertArrayEquals(new int[][] {new int []{2, 6}}, InsertInterval.insert(new int[][]{new int[]{2, 6}}, new int[]{3, 4}));
    }

    @Test
    public void insertNewIntervalStartBeforeIntervalStartTime(){
        assertArrayEquals(new int[][] {new int []{0, 6}}, InsertInterval.insert(new int[][]{new int[]{2, 6}}, new int[]{0, 4}));
    }

    @Test
    public void insertEntireIntervalBeforeAnother(){
        assertArrayEquals(
                new int[][] {
                        new int[] {0,2},
                        new int []{3,6}
                },
                InsertInterval.insert(new int[][]{new int[]{3, 6}}, new int[]{0, 2}));
    }

    @Test
    public void insertNewIntervalStartSameExistingStartTime(){
        assertArrayEquals(new int[][] {new int []{2, 9}}, InsertInterval.insert(new int[][]{new int[]{2, 6}}, new int[]{2, 9}));
    }

    @Test
    public void insertNewIntervalStartAfterExistingStartTime(){
        assertArrayEquals(new int[][] {new int []{2, 7}}, InsertInterval.insert(new int[][]{new int[]{2, 6}}, new int[]{3, 7}));
    }

    @Test
    public void insertNewIntervalConnectsTwoIntervals(){
        assertArrayEquals(new int[][] {new int []{2, 14}}, InsertInterval.insert(new int[][]{
                new int[]{2, 6},
                new int[]{10,14}
        }, new int[]{3, 12}));
    }
}

/**
 * Have a few situations we want to worry about:
 *
 * 1) Start time for new interval is before the first time in currentInterval in a list
 * 2) Start time for new interval is the same as the first time in currentInterval but end time is
 * after second time in currentInterval
 * 3) Start time for new interval is after the first time in currentInterval but end time is after the second time in
 * currentInterval
 * 4) the above cases but also:
 *      a) the end interval is equal to the start interval of a future interval in the intervals list
 *      b) the end interval is between the start and end interval of a future interval in the intervals list
 *      c) the end interval is after the end/before the start interval of a future interval in the intervals list
 *
 * Edge cases where Start time is equal to or after the first time in currentInterval and End time is after second time
 * in current interval. In these cases, nothing should change
 */