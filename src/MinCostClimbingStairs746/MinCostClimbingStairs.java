package MinCostClimbingStairs746;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost){
        int secondPrev = cost[0];
        int prev = cost[1];

        for(int i = 2; i < cost.length; i++){
            int temp = prev;
            prev = Math.min(cost[i] + prev, cost[i] + secondPrev);
            secondPrev = temp;
        }

        return Math.min(prev, secondPrev);
    }
}

/**
 * This problem reminds me of the fibonacci sequence problem "how many combos to walk up stairs if you can go up one or
 * two stairs at a time?". We can use tabulation to help and then maybe figure out how to reduce memory to not store a
 * whole array
 *
 * create an array the same size as the cost array
 * we can prepopulate the first two values of the new array with the first two values of the cost array
 *      we know the cost can't be negative so you can never get a more optimal answer by combining the first two numbers
 * we know those values are always present because length of the input is at least 2
 *
 * for each stair (starting at i = 2)
 * we store the minimum cost to get to the current stair
 * we find that by adding the current cost plus the minimum of the stair two steps below, or the stair one step below
 *
 * we return the minimum of the value at the last and second to last index of the new array
 *
 * This will give us linear time because we iterate over the cost array once
 * This will give us linear storage because we store constant data for each value of the cost array
 *
 *
 *
 * We may be able to do better storage wise if we retain only the sums of the previous two steps
 *
 * set secondPrev to value at index 0
 * set prev to value at index 1
 *
 * for each cost (starting at i = 2)
 * create temp index equal to prev
 * prev = min cost of value at current index plus secondPrev and val at current index plus prev
 * secondPrev = temp value
 *
 * return the minimum of secondPrev and prev
 *
 * This will give us linear time because we iterate over the cost array once
 * this will give us constant space because we're only storing two values
 */

/**
 * I was able to get the most optimal solution using constant space on the first try with constant space, but I messed
 * up the final step, not returning the minimum of the final two options. This is because I missed a simple test case
 * while trying to make a long general case. In the future I should watch out for this mistake.
 */