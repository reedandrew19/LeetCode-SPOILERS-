package SingleNumber136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    public void testOnlyOneNumber(){
        assertEquals(1, SingleNumber.singleNumber(new int[]{1}));
    }

   @Test
   public void testMultiplePairs(){
        assertEquals(4, SingleNumber.singleNumber(new int[]{4,1,2,1,2}));
   }
}