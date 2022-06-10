package AddBinary67;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int sum = 0;
        StringBuilder builder = new StringBuilder();

        while(aIndex >= 0 || bIndex >= 0){
            if(aIndex >= 0){
                if(a.charAt(aIndex) == '1'){
                    sum += 1;
                }
                aIndex -= 1;
            }
            if(bIndex >= 0){
                if(b.charAt(bIndex) == '1'){
                    sum += 1;
                }
                bIndex -= 1;
            }

            builder.append(sum % 2);
            sum /= 2;
        }

        if(sum == 1){
            builder.append(1);
        }

        builder.reverse();
        return builder.toString();
    }
}

/**
 * A niave approach would be to turn the strings into numbers and do arithmetic that way, but that is unnecessary
 * processing, and we can do everything we need to as strings.
 *
 * This problem could also be more difficult if we tried processing the strings forward instead of backwards. Because we
 * need to do addition, we need to line up the least significant figures and add them together. Processing the strings
 * forward to back would mean we'd have to do a lot of null checks and carrying values to the next digit column becomes
 * more complicated to understand. Because of this, processing the string backwards to forwards is easier.
 *
 * create variables for indices of strings a and b setting them to respective string lengths minus 1
 * create string builder
 * create bool carry variable
 * While indices for Strings a and b are greater than or equal to 0
 *      if the chars at the indices are both 1 and carry is false
 *          set carry variable to true
 *          add 0 to stringbuilder
 *      else if the chars at indices are both 1 and carry is true
 *          set carry variable to true
 *          add 1 to string builder
 *      else if the either char at a or b indices is 1 and carry is true
 *          set carry variable to true
 *          add 0 to string builder
 *      else if either char at a or b indices is 1 and carry is false
 *          set carry to false
 *          add 1 to string builder
 *      else if carry is true
 *          set carry to false
 *          add 1 to string builder
 *      else
 *          add 0 to string builder
 *
 * still need to check if we need to add carry variable down the longest string
 *
 *
 * .... Or we can do the much easier solution, hahaha.
 *
 * Create a stringbuilder
 * Create index variables aIndex and bIndex set to the length of strings a and b
 * create sum variable
 * while the either one of variables aIndex or bIndex isn't 0
 *      if aIndex isn't 0 and char at aIndex is 1
 *          add 1 to sum
 *          reduce aIndex by 1
 *      same for bIndex
 *      add sum % 2 to stringbuilder
 *      sum = sum / 2
 *
 * reverse the stringbuilder
 * return built string
 */