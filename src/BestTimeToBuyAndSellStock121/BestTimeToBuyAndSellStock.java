package BestTimeToBuyAndSellStock121;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = Integer.MIN_VALUE;
        int minStockPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < minStockPrice){
                minStockPrice = price;
            }else if(price - minStockPrice > maxProfit){
                maxProfit = price - minStockPrice;
            }
        }

        return maxProfit < 1 ? 0 : maxProfit;
    }
}

/**
 * An easy approach:
 *
 * have a max value initialized at int.min
 * compare each value to each other value
 * if the second value minus the first value is greater than the current max, replace the max value
 *
 * This would lead to n^2 runtime and constant space
 *
 * A dynamic programing approach:
 *
 * create array of max stock value
 * add int.min as first value
 * start at index 1
 * iterate over price array
 *      subtract current number from previous number
 *      if this number is greater than the previous number, set this number to current index in max stock value array
 *      otherwise, add value at previous index to current index
 * return last value of max stock value array
 *
 * this would lead to linear runtime and linear space
 *
 * one pass, not dynamic
 *
 * we need to create and store 2 pieces of info
 *      min stock price
 *      max money gain
 * iterate over the list
 *      if the value at the index is less than the min stock price, replace the min stock price with current value
 *      else if the value at the index minus the min stock price is greater than the max money gain, replace the max
 *
 * return the max money gain
 *
 * this would lead to linear runtime and constant space
 *
 * Today the ugly head of missing important details reared it's head again. I did originally read this problem two
 * nights ago, and reading problems before writing them is a habit I've largely broken, (except for the stair problem I
 * got excited for), so I'm excited to work on problems and NOT HAVE THIS HAPPEN ANYMORE.
 */