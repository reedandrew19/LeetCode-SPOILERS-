package FindTheDifference389;

import java.util.HashMap;

public class FindTheDifference {
    public static char findTheDifference(String s, String t){
        HashMap<Character, Integer> letterOccurrences = new HashMap();

        for(char character : s.toCharArray()){
            letterOccurrences.put(character, letterOccurrences.getOrDefault(character, 0) + 1);
        }

        char returnedLetter = ';';
        for(char character : t.toCharArray()){
            if(!letterOccurrences.containsKey(character) || letterOccurrences.get(character) < 1){
                returnedLetter = character;
            }
            letterOccurrences.put(character, letterOccurrences.getOrDefault(character, 1) - 1);
        }

        return returnedLetter;
    }

    public static char findTheDifferenceArray(String s, String t){
        char[] letterOccurrences = new char[26];

        for(char character : s.toCharArray()){
            letterOccurrences[character - 'a'] += 1;
        }

        char returnedLetter = ';';
        for(char character : t.toCharArray()){
            if(letterOccurrences[character - 'a'] < 1){
                returnedLetter = character;
            }
            letterOccurrences[character - 'a'] -= 1;
        }

        return returnedLetter;
    }

}

/**
 * As soon as I pressed "submit" on this problem, I realized I could have used a char array with size 26 because of the
 * input constraint of only having lowercase chars to count occurrence. This could help with time, but I actually wound
 * up saving space with a HashMap. Either way, remember to use a char array future Andrew!
 */
