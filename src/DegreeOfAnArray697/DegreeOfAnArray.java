package DegreeOfAnArray697;

import java.util.Collections;
import java.util.HashMap;

public class DegreeOfAnArray {
    public static int findDegreeOfArray(int[] nums) {
        HashMap<Integer, Integer> frequencyOfNumbers = new HashMap();
        HashMap<Integer, Integer> leftmostNumberIndex = new HashMap();
        HashMap<Integer, Integer> rightmostNumberIndex = new HashMap();

        for(int i = 0; i < nums.length; i++){
            frequencyOfNumbers.put(nums[i], frequencyOfNumbers.getOrDefault(nums[i], 0) + 1);
            if(!leftmostNumberIndex.containsKey(nums[i])){
                leftmostNumberIndex.put(nums[i], i);
            }
            rightmostNumberIndex.put(nums[i], i);
        }

        int degree = Collections.max(frequencyOfNumbers.values());
        int smallestSubarrayLength = Integer.MAX_VALUE;
        for(int number : frequencyOfNumbers.keySet()){
            if(frequencyOfNumbers.get(number) == degree){
                smallestSubarrayLength = Math.min(smallestSubarrayLength,
                        rightmostNumberIndex.get(number) - leftmostNumberIndex.get(number) + 1);
            }
        }

        return smallestSubarrayLength;
    }
}
/**
 * This problem has taught me that I should pay attention more to the instructions. I've gotten used to a common
 * strategy between similar seeming problems, that when I saw this fit a similar mold, I started coding before finishing
 * the instructions. However, if I were writing this in a team or deliverable setting, I would probably change the name
 * of the problem in order to relieve some of the confusion.
 *
 * By naming the problem after finding subarrays instead of
 * after the degree of the array, we would be more accurately describing the output of the function. Communication and
 * clarity of code is an important part of working in a team setting. Clear descriptive names can reduce the amount of
 * reading and documentation necessary for teammates, and even yourself in the future.
 */