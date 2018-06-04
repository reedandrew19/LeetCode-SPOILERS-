package FindAnagramMappings760;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given two lists A and B, and B is an anagram of A. B is an anagram of A
 * means B is made by randomizing the order of the elements in A.
 *
 * We want to find an index mapping P, from A to B. A mapping P[i] = j means
 * the ith element in A appears in B at index j.
 *
 * These lists A and B may contain duplicates. If there are multiple answers,
 * output any of them.
 *
 * For example, given
 *
 * A = [12, 28, 46, 32, 50]
 * B = [50, 12, 32, 46, 28]
 * We should return
 * [1, 4, 3, 2, 0]
 * as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4
 * because the 1st element of A appears at B[4], and so on.
 * Note:
 *
 * A, B have equal lengths in range [1, 100].
 * A[i], B[i] are integers in range [0, 10^5].
 *
 * Created by Andrew on 6/3/2018.
 */
public class FindAnagramMappings {
    public static int[] findAnagramMappings(int[] A, int[] B) {
        HashMap<Integer, Stack<Integer>> BValueToIndex = new HashMap<>();
        int[] mapping = new int[A.length];

        for(int i = 0; i < B.length; i++){
            if(BValueToIndex.get(B[i]) == null) {
                Stack<Integer> stack = new Stack<>();
                stack.add(i);
                BValueToIndex.put(B[i], stack);
            }else{
                BValueToIndex.get(B[i]).add(i);

            }
        }

        for(int i = 0; i < A.length; i++){
            mapping[i] = BValueToIndex.get(A[i]).pop();
        }

        return mapping;
    }

    public static int[] findAnagramMappingBetter(int[] A, int[] B) {
        HashMap<Integer, Integer> BValueToIndex = new HashMap<>();
        int[] mapping = new int[A.length];

        for(int i = 0; i < B.length; i++) {
            BValueToIndex.put(B[i], i);
        }

        for(int i = 0; i < A.length; i++){
            mapping[i] = BValueToIndex.get(A[i]);
        }

        return mapping;
    }
}
/**
 * My unfortunate misunderstanding of the problem made me get a slower answer
 * (though still correct) than the most optimal solution. I believed that we
 * were trying to give an exact mapping from one letter to another that also
 * proves that the two arrays are anagrams, meaning you can't reuse the same
 * index if a number appears twice. That, unfortunately, was not the case,
 * which lead to extra time initializing stacks. Always remember the importance
 * of understanding the scope of the problem you're trying to solve.
 */