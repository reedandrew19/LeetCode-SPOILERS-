package JudgeRouteCircle657;

import java.util.HashMap;

/**
 * Created by Andrew on 6/15/2018.
 */
public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        HashMap<Character, Integer> numMoves = new HashMap<>();
        numMoves.put('L', 0);
        numMoves.put('R', 0);
        numMoves.put('U', 0);
        numMoves.put('D', 0);

        for(char c : moves.toCharArray()){
            numMoves.put(c, numMoves.get(c) + 1);
        }

        return numMoves.get('L').equals(numMoves.get('R')) &&
                numMoves.get('U').equals(numMoves.get('D'));
    }

    public static boolean judgeCircleJustTwoInts(String moves) {
        int xPosition = 0;
        int yPosition = 0;

        for(char c : moves.toCharArray()){
            if (c == 'L'){
                xPosition -= 1;
            }
            else if(c == 'R'){
                xPosition += 1;
            }
            else if(c == 'U'){
                yPosition += 1;
            }
            else{
                yPosition -= 1;
            }
        }

        return xPosition == 0 && yPosition == 0;
    }
}
/**
 * I had an issue with this problem and I still don't understand it. During my
 * iteration with the HashMap implementation (I was aware of the option to
 * solve the problem with two int variables, but I wanted to test how much
 * faster it was going to be) I did the final return comparison
 *
 * return numMoves.get('L') == numMoves.get('R') &&
 * numMoves.get('U') == numMoves.get('D');
 *
 * This failed. I understand that it most likely failed because the comparison
 * is using == on an Integer object instead of the int primitive, but what I
 * don't understand is why my code passed 42 test cases before failing the test
 * case entitled "TestWhyDoesThisFail". If someone could explain this to me,
 * I would greatly appreciate it.
 *
 * I would also like to discuss the differences between the the HashMap and non
 * HashMap code. I personally prefer the HashMap code because it looks more
 * concise and doesn't have conditional logic in it. However, it does use up
 * more space due to instantiating an object and having the HashMap have 4 key
 * value pairs instead of two plain old int variables. Perhaps you could make
 * polymorphism to cleanly preform an action based on the character value in
 * order to get rid of the conditional logic. But that seems a bit excessive
 * for a practice problem as small as this.
 */
