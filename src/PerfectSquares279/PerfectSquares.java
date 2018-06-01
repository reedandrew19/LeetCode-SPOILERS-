package PerfectSquares279;

import java.util.Arrays;

/**
 * Given a positive integer n, find the least number of perfect square numbers
 * (for example, 1, 4, 9, 16, ...) which sum to n.
 *
 * Created by Andrew on 5/16/2018.
 */
public class PerfectSquares {

    public static int perfectSquares(int N){
        int[] intsInSequence = new int[N];
        int newMin;

        for (int i = 0; i < intsInSequence.length; i++)
            intsInSequence[i] = i + 1;

        for (int i = 2; i <= Math.sqrt(N); i ++){
            for (int j = 3; j < intsInSequence.length; j++){
                newMin = (j + 1) / (i * i);
                if ((j + 1) % (i * i) != 0)
                    newMin += intsInSequence[(j + 1) % (i * i) - 1];

                if (newMin < intsInSequence[j])
                    intsInSequence[j] = newMin;
            }
        }

        return intsInSequence[N - 1];
    }

    public static int perfectSquaresMem(int N){
        int squareRoot = 0;
        while (squareRoot < (int) Math.sqrt(N)){
            squareRoot += 1;
        }

        if (squareRoot == 1){
            return N;
        }

        return Math.min(perfectSquaresHelper(N - squareRoot * squareRoot,
                squareRoot), perfectSquaresHelper(N, squareRoot - 1)) + 1;
    }

    public static int perfectSquaresHelper(int N, int squareRoot) {
        if (N == 0) {
            return 0;
        }

        if (squareRoot == 1) {
            return N - 1;
        }

        if (N - squareRoot * squareRoot >= 0 && squareRoot != 1) {
            return Math.min(perfectSquaresHelper(N - squareRoot * squareRoot,
                    squareRoot), perfectSquaresHelper(N, squareRoot - 1)) + 1;
        } else {
            return perfectSquaresHelper(N, squareRoot - 1) + 1;
        }
    }

    public static int betterPerfectSquaresTab(int n){
        int min;
        int[] perfectSquares = new int[n + 1];

        Arrays.fill(perfectSquares, Integer.MAX_VALUE);
        perfectSquares[0] = 0;

        for(int i = 1; i < perfectSquares.length; i++){
            min = Integer.MAX_VALUE;

            for(int j = 1; i - j * j >= 0; j++){
                min = Math.min(min, perfectSquares[i - j * j] + 1);
            }

            perfectSquares[i] = min;
        }

        return perfectSquares[n];
    }

    public static int perfectSquaresFunctional(int N){
        return 0;
    }
}

/**
 * Here lies a problem I received for an interview, my first technical
 * interview to be precise. I was able to recognize that this was a practice
 * problem during the technical interview, however I approached the problem
 * from a memoized angle instead of tabular. I explained that I like this way
 * better because it aligns better with functional programming, as there is no
 * state that I need to worry about from for loops. I was only able to get
 * through about 80% of the problem however. When time was up, my interviewer
 * told me to approach it from the bottom up approach, however. Whether it was
 * because tabulation is generally a bit faster or because he believed this
 * route to be less confusing, I was unclear. Two days later I looked at the
 * problem again and solved it the way my interviewer suggested. There was a
 * slight optimization in the nested for loop, starting the iteration of the
 * array at index 3, because there will never be a perfect square to optimize
 * the numbers below 4 (3, 2, or 1 - 4 leads to a negative number). A similar
 * optimization was made for the perfect square iteration at 2, as 1 is the
 * basis for finding the minimum sequence of perfect squares, it can be skipped
 * because it isn't possible to reduce the base case.
 *
 * It wasn't until after the interview that I considered: "perhaps it's
 * possible to use streams to make tabulation functional..." I will be
 * exploring this possibility in the days to come.
 *
 * Post Submission: submission accepted! woo!! But alas. After telling my
 * recruiter I found the fastest answer after he asked what I thought about the
 * interview.... what a blunder that was. The more I do these practice problems
 * the more I'm coming to realize these problems usually have a constant time
 * solution.... CURSE YOU LARANGE'S FOUR SQUARE THEOREM!!!
 *
 * ...Nah but it's a cool theorem.
 */