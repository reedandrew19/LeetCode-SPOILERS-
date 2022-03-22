package MeetingRooms252;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0], b[0]);
            }
        });

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < intervals[i - 1][1]){
                return false;
            }
        }

        return true;
    }
}
/**
 * I'll admit, this may be my first sorting problem, but it made me feel pretty smart. I had to look up how to use
 * Comparator's because I haven't used them in a dog's age, but for a first try on a more complex sort and figuring out
 * what it means for a meeting to conflict with another, i feel pretty happy
 */