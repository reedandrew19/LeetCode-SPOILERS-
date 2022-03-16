package RomanToInteger13;

import java.util.HashMap;

public class RomanToInteger {

    static HashMap<String, Integer> romanNumeralValues = new HashMap<>();

    static{
        romanNumeralValues.put("I", 1);
        romanNumeralValues.put("V", 5);
        romanNumeralValues.put("X", 10);
        romanNumeralValues.put("L", 50);
        romanNumeralValues.put("C", 100);
        romanNumeralValues.put("D", 500);
        romanNumeralValues.put("M", 1000);
    }

    public static int romanToInt(String romanNumeral){
        int value = 0;
        int prevValue = 0;
        int currValue;

        for(int i = romanNumeral.length() - 1; i >= 0; i--){
            currValue = romanNumeralValues.get(romanNumeral.substring(i, i + 1));
            if(prevValue > currValue){
                value -= currValue;
            }else{
                value += currValue;
            }
            prevValue = currValue;
        }

        return value;
    }
}
/**
 * Man, this problem was humiliating... I had to look up the answer to it because I didn't understand the problem in the
 * slightest. One of the problems I had is thinking my return type was a String instead of an integer, which makes this
 * problem MONUMENTALLY harder. Lesson learned: always read the problem carefully and understand the input and output
 * parameters.
 *
 * On the plus side, I was able to come up with what I consider a more readable solution than what's posted as the
 * solution on leetCode. I also made use of refactoring hotkeys. Here's to hoping I'm able to pick these up faster now
 * that I have a problem under my belt!
*/