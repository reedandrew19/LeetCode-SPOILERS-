package FibonacciNumber509;

public class FibonacciNumber {
    public static int fibRecursive(int n){
        return helper(n);
    }

    private static int helper(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return helper(n - 1) + helper(n - 2);
        }
    }

    public static int fibDynamic(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < n + 1; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static int fibBetter(int n){
        if(n < 2){
            return n;
        }

        int prevPrev = 0;
        int prev = 1;

        for(int i = 2; i <= n; i++){
            prev = prev + prevPrev;
            prevPrev = prev - prevPrev;
        }

        return prev;
    }
}

/**
 * The Fibonacci sequence is based on using previous answers in order to find future answers. This is a prime case for
 * using recursion or dynamic programming. For recursion, we're going to start by getting the finding what the base
 * termination case is. that should be when n = 1, return 0, and when n = 2 we return 1. Otherwise, we add the
 * evaluation of the previous evaluation of the function.
 *
 * helper(n){
 *     if(n = 1){
 *         return 0;
 *     }else if(n = 2){
 *         return 1;
 *     }else{
 *         return helper(n - 1) + helper(n - 2);
 *     }
 * }
 *
 * When it comes to the dynamic programming way, we can do the following
 *
 * create array of length n
 * set value of 0th index as 0
 * set value of 1st index as 1
 * for i = 2; i < array.length; i++
 *      value at i = value of i - 2 + value at i - 1
 * return value at n - 1
 *
 */

/**
 * Reflection:
 *
 * Two issues:
 * 1) I had a hard time wrapping my head around functional notation, which is pretty embarrassing.
 * 2) I need to remember that I don't NEED to store an array in all cases when working a dynamic programming problem.
 */