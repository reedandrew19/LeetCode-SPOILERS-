package FlippingAnImage832;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 *
 * Created by Andrew on 6/5/2018.
 */
public class FlippingAnImageTest {
    @Test
    public void TestFlip(){
        assertTrue(Arrays.deepEquals(new int[][]{new int[]{1,0,0},
                new int[]{0,1,0},
                new int[]{1,1,1}},
                FlippingAnImage.flipAndInvertImage(
                        new int[][]{new int[]{1, 1, 0},
                                new int[]{1, 0, 1},
                                new int[]{0, 0, 0}})));
    }

    @Test
    public void TestFlipLonger(){
        assertTrue(Arrays.deepEquals(new int[][]{
                        new int[]{1,1,0,0},
                        new int[]{0,1,1,0},
                        new int[]{0,0,0,1},
                        new int[]{1,0,1,0}},
                FlippingAnImage.flipAndInvertImage(
                        new int[][]{new int[]{1,1,0,0},
                                new int[]{1,0,0,1},
                                new int[]{0,1,1,1},
                                new int[]{1,0,1,0}})));
    }

    @Test
    public void TestFlipNotSquare(){
        assertTrue(Arrays.deepEquals(new int[][]{
                        new int[]{1,1,0,0},
                        new int[]{0,1,1,0},
                        new int[]{0,0,0,1}},
                FlippingAnImage.flipAndInvertImage(
                        new int[][]{new int[]{1,1,0,0},
                                new int[]{1,0,0,1},
                                new int[]{0,1,1,1}})));
    }
}