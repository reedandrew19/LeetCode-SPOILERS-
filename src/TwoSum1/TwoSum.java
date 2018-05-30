package TwoSum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice.
 *
 * Created by Andrew on 5/22/2018.
 */
public class TwoSum {
    public static int[] TwoSum(int[] nums, int target){
        HashMap<Integer, Stack<Integer>> valToIdx = new HashMap<>();
        int forwardCurs = 0;
        int backwardsCurs = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(!valToIdx.containsKey(nums[i])){
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                valToIdx.put(nums[i], stack);
            }
            else{
                valToIdx.get(nums[i]).push(i);
            }
        }

        Arrays.sort(nums);
        while(forwardCurs < backwardsCurs){
            if(nums[forwardCurs] + nums[backwardsCurs] == target){
                int[] arr = new int[]{valToIdx.get(nums[forwardCurs]).pop(),
                        valToIdx.get(nums[backwardsCurs]).pop()};
                Arrays.sort(arr);
                return arr;
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

    public static int[] BetterTwoSum(int[] nums, int target){
        HashMap<Integer, Integer> compToIdx = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(compToIdx.containsKey(nums[i])){
                return new int[]{compToIdx.get(nums[i]), i};
            }

            compToIdx.put(target - nums[i], i);
        }

        return new int[]{-1, -1};
    }
}

/**
 * Yet another example of simpler looking code also being more efficient. My
 * initial solution was nlogn worst time in this implementation: iterating
 * through the original array and keeping the original indeces (n), sorting an
 * array using Quick Sort (nlogn), then going through the sorting array from
 * both ends until you find an answer that works (n). There is a final step,
 * unfortunately, because the test cases don't check for the array in reverse
 * order, you also need to sort the array you're returning as well. This would,
 * however, become O(n) worst time if you replace quick sort with radix or
 * counting sort, which you can do because they are integers (you can split an
 * array into a positive and negative array, flip the negative array, sort it,
 * then reverse it and make all the members the negative version, or something
 * similar to get O(n) time sorting for numbers with negative numbers). I just
 * didn't want to implement one of those sorting methods right now because I
 * wanted to finish coding before bed time.
 *
 * However, as always, there was a faster answer. By storing the compliments
 * of the previous answers in a HashMap with their index, you can pass through
 * the array once and return the correct answer in order. Also... If you check
 * the first place answer for this, they aren't actually doing computation,
 * just a bunch of if else statements checking for each test case.... cheap way
 * of getting a constant time answer...
 */