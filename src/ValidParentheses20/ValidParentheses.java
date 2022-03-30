package ValidParentheses20;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> openBrackets = new Stack();

        for(char bracket : s.toCharArray()){
            if(openBrackets.isEmpty() && (bracket == ']' || bracket == '}' || bracket == ')')){
                return false;
            }else if(bracket == ')' && openBrackets.pop() != '('){
                return false;
            }else if(bracket == '}' && openBrackets.pop() != '{'){
                return false;
            }else if(bracket == ']' && openBrackets.pop() != '['){
                return false;
            }else if(bracket == '{' || bracket == '(' || bracket =='['){
                openBrackets.push(bracket);
            }
        }

        if(openBrackets.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isValidCleaner(String s){
        Stack<Character> openBrackets = new Stack();

        HashMap<Character,Character> brackets = new HashMap();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');

        for(Character bracket : s.toCharArray()){
            //if bracket is a closed bracket
            if(brackets.containsKey(bracket)){
                char currBracket = openBrackets.isEmpty() ? '#' : openBrackets.pop();

                if(currBracket != brackets.get(bracket)){
                    return false;
                }
            }else{
                openBrackets.push(bracket);
            }
        }

        if(openBrackets.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * I could have improved this solution on three fronts:
 * 1) I didn't realize for my first submission that Stack.pop() would throw an error instead of returning null.
 * 2) I didn't realize the edge case of a string that has additional trailing closed brackets.
 * 3) By not utilizing a HashMap, the code was significantly less clean.
 *
 * The first and third I don't see as being too big of an issue, but the second issue is something I should meditate on.
 */
