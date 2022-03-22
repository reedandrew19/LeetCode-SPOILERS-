package ReorderDataInLogFiles937;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataInLogFiles {
    public static String[] reorderLogFiles(String[] logs){
        Arrays.sort(logs, new Comparator<String>(){
            @Override
            public int compare(String log1, String log2){
                String[] splitLog1 = log1.split(" ", 2);
                String[] splitLog2 = log2.split(" ", 2);

                boolean isFirstStringDigits = Character.isDigit(splitLog1[1].charAt(0));
                boolean isSecondStringDigits = Character.isDigit(splitLog2[1].charAt(0));

                if(!isFirstStringDigits && !isSecondStringDigits){
                    int comp = splitLog1[1].compareTo(splitLog2[1]);
                    if(comp == 0){
                        return splitLog1[0].compareTo(splitLog2[0]);
                    }else{
                        return comp;
                    }
                }else if(!isFirstStringDigits && isSecondStringDigits){
                    return -1;
                }else if(isFirstStringDigits && !isSecondStringDigits){
                    return 1;
                }else{
                    return 0;
                }
            }
        });

        return logs;
    }
}
/**
 * This problem was mostly just copying the answer that was on leetCode. For an easy problem, it's a little upsetting,
 * but it appears this problem was hard for many people. I had a few blind spots here, not knowing there was a Character
 * function that allows you to identify if a character is a digit, not knowing the split method allows you to cap the
 * amount of splits a string undergoes, and confusion over how Comparators work in complex situations. Though it seems
 * like an outlier, I'll probably return to this problem.
 */
