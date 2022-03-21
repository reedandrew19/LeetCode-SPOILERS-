package UniqueNumberOfOccurrences1207;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer, Integer> numberOccurrences = new HashMap<>();

        for(int number : arr){
            numberOccurrences.put(number, numberOccurrences.getOrDefault(number, 0) + 1);
        }

        HashSet<Integer> occurrences = new HashSet<>();
        for(int number : numberOccurrences.values()){
            if(occurrences.contains(number)){
                return false;
            }
            occurrences.add(number);
        }

        return true;
    }


}

/**
 * I figured out the first part of the problem fairly well, but I learned a new method of HashMaps that gives a default
 * if the map doesn't contain a value for a given key, I'll make use of this in the future to make my code cleaner
 */
