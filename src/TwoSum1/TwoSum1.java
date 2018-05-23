package TwoSum1;

import java.util.Arrays;
import java.util.HashMap;

/**
 *Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice.
 *
 * Created by Andrew on 5/22/2018.
 */
public class TwoSum1 {
    public static int[] TwoSum(int[] nums, int target){
        HashMap<Integer, Integer> valToIdx = new HashMap<>();
        int forwardCurs = 0;
        int backwardsCurs = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            valToIdx.put(nums[i], i);
        }

        Arrays.sort(nums);
        while(forwardCurs < backwardsCurs){
            if(nums[forwardCurs] + nums[backwardsCurs] == target){
                return new int[]{valToIdx.get(nums[forwardCurs]),
                        valToIdx.get(nums[backwardsCurs])};
            }

            if(nums[forwardCurs] + nums[backwardsCurs] > target){
                backwardsCurs -= 1;
            }

            if(nums[forwardCurs] + nums[backwardsCurs] < target){
                forwardCurs += 1;
            }
        }

        return new int[]{-1, -1};
    }
}
