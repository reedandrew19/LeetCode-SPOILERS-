package JewelsAndStones771;

import java.util.Arrays;

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

    }

}
