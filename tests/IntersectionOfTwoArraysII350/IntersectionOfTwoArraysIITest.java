package IntersectionOfTwoArraysII350;

import IntersectionOfTwoArrays349.IntersectionOfTwoArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {

    @Test
    public void testSingleEmptyArray(){
        assertArrayEquals(new int[]{}, IntersectionOfTwoArraysII.intersect(new int[]{}, new int[]{-1, 0, 6996}));
    }

    @Test
    public void testPopulatedArraysNoIntersection(){
        assertArrayEquals(new int[]{}, IntersectionOfTwoArraysII.intersect(new int[]{-453, 79, -2, 54}, new int[]{0, 67, 888}));
    }

    @Test
    public void testPopulatedArraysMultipleIntersections(){
        assertArrayEquals(new int[]{66, -54}, IntersectionOfTwoArraysII.intersect(new int[]{0, 99, -54, 77, 66, 0},
                new int[]{66, 990, 43, -54}));
    }

    @Test
    public void testPopulatedArraysDuplicatedIntersection(){
        assertArrayEquals(new int[]{2, 2, 2}, IntersectionOfTwoArraysII.intersect(new int[]{2, 2, 2}, new int[]{2, 2, 2}));
    }
}