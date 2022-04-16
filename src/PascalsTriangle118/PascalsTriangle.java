package PascalsTriangle118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows){
        ArrayList<List<Integer>> returnList = new ArrayList(numRows);

        returnList.add(Arrays.asList(1));
        if(numRows == 1){
            return returnList;
        }

        returnList.add(Arrays.asList(1,1));
        if(numRows == 2){
            return returnList;
        }

        for(int i = 2; i < numRows; i++){
            ArrayList<Integer> newList = new ArrayList(i);
            newList.add(1);
            for(int j = 1; j < i; j++){
                List<Integer> prevList = returnList.get(i - 1);
                newList.add(prevList.get(j) + prevList.get(j - 1));
            }
            newList.add(1);
            returnList.add(newList);
        }

        return returnList;
    }
}

/**
 * list is array list
 *      we know the sizes of all the lists, so we never have to create a new list and copy values over on adding
 *      adding and retrieving are constant time
 *
 * create return list of length numRows
 * add new list with value {1} to return list
 * if numRows = 1 return list
 *
 * add new list with values {1,1}
 * if numRows = 2 return list
 *
 * for i = 2; i < numRows; i++
 *      create new list of length i
 *      add one to new list
 *      for j = 1; j < i ; j++
 *          add value at j and value at j - 1 from old list and add to next position in new list
 *      add 1 to new list
 *      add new list to return list
 * return the new list
 */

/**
 * I got this mostly right, but my code could be a little cleaner if I realized that my algorithm already works for the
 * case where the previous row is the first row. because we initialize j to be higher than 0, our for loop will
 * terminate, never leading to an index out of bounds error. The lesson here is to check if you can condense your logic
 * before finishing your problem.
 */