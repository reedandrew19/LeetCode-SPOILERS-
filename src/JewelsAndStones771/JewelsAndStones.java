package JewelsAndStones771;

import java.util.Arrays;
import java.util.HashSet;

/**
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have.  Each character in S is a type of stone
 * you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type
 * of stone from "A".
 *
 * Created by Andrew on 5/29/2018.
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int j = 0;
        int s = 0;
        int numJewels = 0;

        char[] JArr = J.toCharArray();
        char[] SArr = S.toCharArray();

        Arrays.sort(JArr);
        Arrays.sort(SArr);

        while(j < JArr.length && s < SArr.length){

            if (SArr[s] == JArr[j]){
                numJewels += 1;
            }

            if(SArr[s] <= JArr[j] && s < SArr.length){
                s += 1;
            }else if(SArr[s] > JArr[j] && j < JArr.length){
                j += 1;
            }
        }

        return numJewels;
    }

    public static int numJewelsInStonesHash(String J, String S){
        HashSet<Character> set = new HashSet<>(52);
        int numJewels = 0;

        for(char jewel : J.toCharArray()){
            set.add(jewel);
        }

        for(char jewel : S.toCharArray()){
            if(set.contains(jewel)){
                numJewels += 1;
            }
        }

        return numJewels;
    }
    /**
     * Sooooo I'm super confused. My submission for the hash table answer is
     * slower than my answer with sorting. Maybe it's Arrays.sort() is super
     * optimized... Oh well. The lower code looks neater anyway.
     *
     */
}
