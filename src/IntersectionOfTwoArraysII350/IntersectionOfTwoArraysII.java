package IntersectionOfTwoArraysII350;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> nums1Occurrences = new HashMap();

        for(int number : nums1){
            nums1Occurrences.put(number, nums1Occurrences.getOrDefault(number, 0) + 1);
        }

        ArrayList<Integer> intersection = new ArrayList();
        for(int number : nums2){
            if(nums1Occurrences.containsKey(number) && nums1Occurrences.get(number) > 0){
                intersection.add(number);
                nums1Occurrences.put(number, nums1Occurrences.get(number) - 1);
            }
        }

        int[] intersectionArray = new int[intersection.size()];
        for(int i = 0; i < intersection.size(); i++){
            intersectionArray[i] = intersection.get(i);
        }

        return intersectionArray;
    }
}
