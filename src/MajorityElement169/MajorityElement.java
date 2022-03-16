package MajorityElement169;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums){
        int maxOccurrence = 0;
        int maxNumber = 0;
        HashMap<Integer, Integer> valueFrequency = new HashMap<>();

        for(int number: nums){
            if(valueFrequency.containsKey(number)) {
                valueFrequency.put(number, valueFrequency.get(number) + 1);
            }else{
                valueFrequency.put(number, 1);
            }

            if(valueFrequency.get(number) > maxOccurrence){
                maxOccurrence = valueFrequency.get(number);
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public static int majorityElementBetter(int[] nums){
        int currCandidate = 0;
        int count = 0;
        for(int number : nums) {
            if (count == 0) {
                currCandidate = number;
            }

            count += (number == currCandidate) ? 1 : -1;
        }
        return currCandidate;
    }
}

/*
I learned another important thing during this problem. LeetCode will sometimes tag a problem with a certain data
structure even if the most efficient algorithm doesn't use the data structure tagged. I should have realized this when
they asked how to do this in O(1) space, but I was too excited to do more HashMap problems.

I wish there was a way to filter for tags and ONLY the tags for the most efficient algorithm, but in the meantime, I'll
keep practicing HashMap problems until I believe I'm proficient, then I'll move onto the next data structure.
 */