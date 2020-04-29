package LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Andrew on 5/27/2018.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        int longestStringLength = 0;
        int currentWordStartingIndex = 0;
        HashMap<Character, Integer> lettersOfIndex = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(lettersOfIndex.containsKey(letter) && currentWordStartingIndex <= lettersOfIndex.get(letter)) {
                currentWordStartingIndex = lettersOfIndex.get(letter) + 1;
            }

            lettersOfIndex.put(letter, i);
            longestStringLength = Math.max(longestStringLength, i - currentWordStartingIndex + 1);
        }

        return longestStringLength;
    }
}
