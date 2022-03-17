package ValidAnagram242;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> charsInString1 = new HashMap<>();

        for(char letter : s.toCharArray()){
            if(charsInString1.containsKey(letter)){
                charsInString1.put(letter, charsInString1.get(letter) +1);
            }else{
                charsInString1.put(letter, 1);
            }
        }

        for(char letter : t.toCharArray()){
            if(charsInString1.get(letter) == null || charsInString1.get(letter) < 1){
                return false;
            }else{
                charsInString1.put(letter,charsInString1.get(letter) - 1);
            }
        }

        for(Map.Entry<Character, Integer> keyPair : charsInString1.entrySet()){
            if(keyPair.getValue() > 0){
                return false;
            }
        }

        return true;
    }
}
/*
I mostly got this the first try, thinking of both the array and sorting methods and making the decision to go with a
HashMap in cases where any char is used, not just letters. But I didn't think about the early termination for if the
strings aren't equal. In the future, I should look at surefire ways a condition can or can't be met. While thinking that
I realized there's another early termination case that isn't being checked in the posted solution: if the two strings
are equal upon input. This would, however, in most cases not be the case so it would probably be slower on average.

On further reflection, I also noticed my two for loops can be condensed into one for loop to save computation and make
the solution cleaner. I think I can improve by spending more time contemplating the problem before starting to code.
 */