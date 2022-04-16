package BestTimeToBuyAndSellStock121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    public void testSingleNumber(){
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[]{1}));
    }

    @Test
    public void testOnlyDecreasingStockPrice(){
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[]{2000, 1900, 1750, 1239, 569, 230}));
    }

    @Test
    public void testTwoRelativeMinMaxesSecondBetter(){
        assertEquals(6, BestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,0,1,6,5}));
    }

    @Test
    public void testTwoRelativeMinMaxesFirstBetter(){
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,0,1}));
    }
}