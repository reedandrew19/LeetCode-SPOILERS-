package LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashMap;

/**
 * Created by Andrew on 5/27/2018.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int LongestSubstringWithoutRepeatingCharacters(String s){
        int[] longestSubstring = new int[s.length()];
        int endOfPrevSubstring = -1;
        HashMap<Character, Integer> charToIndex = new HashMap<>();

        if(s.length() == 0){
            return 0;
        }

        longestSubstring[0] = 1;
        charToIndex.put(s.charAt(0), 0);

        for(int i = 1; i < s.length(); i++){
            if(charToIndex.containsKey(s.charAt(i))){
                endOfPrevSubstring = Math.max(endOfPrevSubstring,
                        charToIndex.get(s.charAt(i)));
            }

            longestSubstring[i] = Math.max(i - endOfPrevSubstring,
                    longestSubstring[i - 1]);
            charToIndex.put(s.charAt(i), i);
        }

        return longestSubstring[s.length() - 1];
    }
}
