package ThreeSum15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> returnList = new LinkedList();
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                twoSum(nums, returnList, i);
            }
        }

        return returnList;
    }

    private static void twoSum(int[] nums, List<List<Integer>> returnList, int i) {
        int lowPointer = i + 1;
        int highPointer = nums.length - 1;

        while(lowPointer < highPointer){
            int sum = nums[i] + nums[lowPointer] + nums[highPointer];
            if(sum == 0){
                returnList.add(Arrays.asList(nums[i], nums[lowPointer], nums[highPointer]));
                highPointer -= 1;
                lowPointer += 1;
                while(lowPointer < highPointer && nums[lowPointer] == nums[lowPointer - 1]){
                    lowPointer += 1;
                }
            }else if(sum < 0){
                lowPointer += 1;
            }else{
                highPointer -= 1;
            }
        }
    }
}
