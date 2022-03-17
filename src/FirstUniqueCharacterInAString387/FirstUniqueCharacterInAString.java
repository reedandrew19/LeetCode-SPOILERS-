package FirstUniqueCharacterInAString387;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s){
        HashMap<Character, Integer> indexOfUniqueChar = new HashMap<>();

        if(s.length() == 1){
            return 0;
        }

        for(int i = 0; i < s.length(); i++){
            if(indexOfUniqueChar.containsKey(s.charAt(i))){
                indexOfUniqueChar.put(s.charAt(i), -1);
            }else{
                indexOfUniqueChar.put(s.charAt(i), i);
            }
        }

        //-1 for when there is no unique char in the string
        int indexOfFirstUniqueChar = Integer.MAX_VALUE;
        boolean haveFoundUniqueChar = false;

        for(Map.Entry<Character, Integer> keyPair : indexOfUniqueChar.entrySet()){
            if(keyPair.getValue() != -1 && keyPair.getValue() < indexOfFirstUniqueChar){
                indexOfFirstUniqueChar = keyPair.getValue();
                haveFoundUniqueChar = true;
            }
        }

        return haveFoundUniqueChar ? indexOfFirstUniqueChar : -1;
    }
}

/**
This problem was a lot of fun to find a HashMap solution that only iterates through the string once, however I now
understand that in cases where you know for certain the size of the keySet, you can use an array to save time. Because
of this, I will pay more attention to the constraints and reference that when applicable. However, I'll implement both
ways just in case my interviewer wants to see my knowledge of HashMaps vs Arrays.
 */
