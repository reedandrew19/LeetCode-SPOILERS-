package InsertInterval57;

import java.util.LinkedList;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval){
        LinkedList<int[]> returnList = new LinkedList();
        int index = 0;

        while(index < intervals.length && intervals[index][0] < newInterval[0] ){
            returnList.add(intervals[index]);
            index += 1;
        }

        if(returnList.isEmpty() || returnList.getLast()[1] < newInterval[0]){
            returnList.add(newInterval);
        }else{
            int[] interval = returnList.removeLast();
            interval[1] = Math.max(newInterval[1], interval[1]);
            returnList.addLast(interval);
        }

        while(index < intervals.length){
            if(intervals[index][0] <= newInterval[1]){
                int[] interval = returnList.removeLast();
                interval[1] = Math.max(intervals[index][1], interval[1]);
                returnList.addLast(interval);
            }else{
                returnList.add(intervals[index]);
            }
            index += 1;
        }


        return returnList.toArray(new int[returnList.size()][2]);
    }
}
/**
 * We need to create a new return object because the input double array may be bigger than the return double array
 *
 * We can do this by storing the data as a linked list and returning its toArray method to reduce complexity.
 *
 * Two cases: if the start time of newInterval is after the endtime of the current interval, add the current interval
 * to the return list
 *
 * Otherwise: need to do calculations for inserting new interval merged with existing intervals
 *      if newInterval start time && end time is before interval start time
 *          add new interval and then existing interval to return list
 *      if new interval start time is before interval start time
 *          set start time to new interval start time
 *
 */