package FindTheTwonJudge997;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheTownJudgeTest {

    @Test
    public void testNoJudge(){
        assertEquals(-1, FindTheTownJudge.findJudge(4, new int[][]{
                new int[]{1,2},
                new int[]{3,2},
                new int[]{4,2},
                new int[]{2,1}
        }));
    }

    @Test
    public void testTwoTownspeople(){
        assertEquals(2, FindTheTownJudge.findJudge(2, new int[][]{
                new int[]{1,2}
        }));
    }

    @Test
    public void testJudgeFound(){
        assertEquals(3, FindTheTownJudge.findJudge(5, new int[][]{
                new int[]{1,3},
                new int[]{1,4},
                new int[]{2,1},
                new int[]{2,3},
                new int[]{2,4},
                new int[]{4,3},
                new int[]{5,3},
                new int[]{5,2}
        }));
    }
}