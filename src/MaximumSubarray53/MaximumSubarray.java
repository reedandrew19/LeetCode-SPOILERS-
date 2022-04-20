package MaximumSubarray53;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums){
        int maxSubArrayValue = nums[0];
        int currSubArrayValue = nums[0];

        for(int i = 1; i < nums.length; i++){
            currSubArrayValue = Math.max(nums[i], nums[i] + currSubArrayValue);
            maxSubArrayValue = Math.max(maxSubArrayValue, currSubArrayValue);
        }

        return maxSubArrayValue;
    }
}