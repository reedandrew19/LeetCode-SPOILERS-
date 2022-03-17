package ContainsDuplicate217;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> existingNumbers = new HashSet<>();

        for(int number : nums){
            if(existingNumbers.contains(number)){
                return true;
            }
            existingNumbers.add(number);
        }

        return false;
    }
}
/*
First problem since studying where I got the optimal answer on the first try! It's a pity that Java can't initialize
HashSets using an array because there was a GORGEOUS solution in JavaScript, Python, and C# where you do so and compare
the size of the HashSet to the size of the int array to see if they're equal. only two lines and fantastic. Definitely
didn't think of that, but i'll try to keep it in mind for the future.
 */