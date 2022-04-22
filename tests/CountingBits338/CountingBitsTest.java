package CountingBits338;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {

    @Test
    public void test(){
        assertEquals(Arrays.toString(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2,  3,  2,  3,  3,  4,  1,  2}),
                Arrays.toString(CountingBits.countBits(17)));
    }
}