package MinCostClimbingStairs746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    public void test(){
        assertEquals(106, MinCostClimbingStairs.minCostClimbingStairs(new int[]
                {1,100,100,100,1,  1,  1,  100,1,  1,  100,1}));
    }
}