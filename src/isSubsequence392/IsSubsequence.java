package isSubsequence392;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t){
        int subsequencePointer = 0;
        int otherStringPointer = 0;

        while(subsequencePointer < s.length() && otherStringPointer < t.length()){
            if(s.charAt(subsequencePointer) == t.charAt(otherStringPointer)){
                subsequencePointer += 1;
            }
            otherStringPointer += 1;
        }

        if(subsequencePointer == s.length()){
            return true;
        }

        return false;
    }
}

/**
 * we want to have two pointers
 *      one pointer for subsequence, one for other string
 * try to find the first letter of the subsequence in the other string
 *      when you find it, move the pointer of the subsequence further
 *      if the character at the pointer for the other string is not equal to the char at the subsequence string's pointer
 *          keep the subsequence string pointer where it is
 *      in both cases, you move the other string's pointer forward
 * when the pointer of the subsequence string is equal to its length, you have found all the letters and can return true
 * if you go through the whole other string's length and the subsequence pointer isn't at the subsequence's length
 *      return false
 *
 * This will lead to a worst case time complexity of O(S + T) where S is the length of the subsequence string and T is
 * the length of the other string t. This has a constant space complexity.
 */

/**
 * I found the optimal solution my first try however I messed up the && logic in the predicate of my while loop, using
 * || instead. I should focus on && vs || logic in the future.
 */