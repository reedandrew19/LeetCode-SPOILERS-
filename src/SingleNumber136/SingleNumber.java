package SingleNumber136;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        int xOrSum = 0;

        for(int number : nums){
            xOrSum ^= number;
        }

        return xOrSum;
    }
}

/**
 * when doing xor operation of two numbers, you get 0
 * so if you go through the list performing xor for every number in the list, we will end the list with the sole number
 * without a pair
 */

