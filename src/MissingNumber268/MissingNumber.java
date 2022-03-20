package MissingNumber268;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        int total = 0;

        for(int number : nums){
            total += number;
        }

        return (nums.length * (nums.length + 1) / 2) - total;
    }

    public static int missingNumberBitManipulation(int[] nums){
        int missingNumber = nums.length;

        for(int i = 0; i < nums.length; i++){
            missingNumber = missingNumber ^ i ^ nums[i];
        }

        return missingNumber;
    }
}

/**
 * I am so incredibly proud that I was able to come up with Gauss' Formula during this question. Even more exciting is I
 * got it wrong the first time and I derived the formula on the spot! I thought it was n(n-1)/2, not n+1! While this
 * was extremely exciting for me, I was still shocked with the bit manipulation answer. Bit manipulation was a topic we
 * didn't study much in college, so I'm extremely rusty. Doing this problem, however, made me thirsty to learn it.
 */