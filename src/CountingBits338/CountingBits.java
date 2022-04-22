package CountingBits338;

public class CountingBits {
    public static int[] countBits(int n){
        int[] returnArray = new int[n+1];
        for(int i = 1; i <= n; i++){
            returnArray[i] = returnArray[i / 2] + (i % 2);
        }

        return returnArray;
    }
}

/**
 * we know an even number always ends in a 0 and an odd number always ends in a 1
 * we can find the remainder if we divide by two to find the least significant bit of a number
 *
 * create an array with size = given number
 * we do this for every number up to the number given to us (start at i = 1, end when i <= given number)
 * first we create a counter for the number of 1's in the number's binary representation
 * we find the remainder by using mod 2
 * if the remainder is 1, then add one to the counter
 * we then divide the number by 2 to get the next least significant bit
 * we continue this until the original number is 0
 * we add this number to the array at position i - 1
 *
 * this will give us nlogn time because we perform log n divides per number starting from 1 up to the number given to us
 * this doesn't use any additional space besides the space we need to return our answer, but that space is linear
 *
 * there may be a way for us to find a better option using dynamic programming
 *
 * if n = 0
 *      return [0]
 *
 * create an answer array with size = input number + 1
 *
 * for each number (start with i = 2 until i <= number given)
 *      if index value is even
 *          bits = value of bits at index i/2
 *      if index value is odd
 *          bits = (value of bits at index i/2) + 1
 *      add bits to array at index i
 *
 * return array
 *
 * this gives us linear time because we are iterating over the array once and doing constant operations for each element
 * there is only constant additional space needed besides the return array
 */

/**
 * I was able to find the most optimal solution, but not the cleanest solution. I made three mistakes:
 *
 * 1: I forgot that when you initialize an int array, the values get initialized at 0, so you don't need to do an early
 * return in the case that n = 0
 *
 * 2: I made a silly mistake that 2/2 = 0  instead of 1, which made me think I needed to add another return statement
 * for the case when n = 2
 *
 * 3: I forgot in the case when you're working with odd or even numbers, mod 2 becomes a very important equation. I
 * forgot that 2 % 2 equals 0, which meant I had a different branching path for when x was even or odd when I could have
 * collapsed the branching conditions into one path that adds either 1 or 0.
 */