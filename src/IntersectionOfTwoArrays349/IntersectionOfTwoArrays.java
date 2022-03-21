package IntersectionOfTwoArrays349;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> numbers = new HashSet();

        for(int number : nums1){
            numbers.add(number);
        }

        ArrayList<Integer> list = new ArrayList();
        for(int number : nums2){
            if(numbers.contains(number)){
                list.add(number);
                numbers.remove(number);
            }
        }

        int[] returnedList = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            returnedList[i] = list.get(i);
        }

        return returnedList;
    }
}
/**
 * This question was fairly easy, but during the problem I learned converting Arraylists to arrays of primitives isn't
 * as easy as it feels like it should be. You either need to stream or write out the conversion yourself. I also learned
 * that streaming to get an array is very time intensive. We should probably stay away from streams for efficiency sake
 * during interview practice.
 */
