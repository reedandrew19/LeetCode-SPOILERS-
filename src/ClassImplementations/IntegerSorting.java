package ClassImplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrew on 5/31/2018.
 */
public class IntegerSorting {
    /****************************************************************************
     * Author: Isai Damier
     * Title: Radix Sort
     * Project: geekviewpoint
     * Package: algorithms
     *
     * Statement:
     *   Given a disordered list of integers, rearrange them in natural order.
     *
     * Sample Input: {18,5,100,3,1,19,6,0,7,4,2}
     *
     * Sample Output: {0,1,2,3,4,5,6,7,18,19,100}
     *
     * Time Complexity of Solution:
     *   Best Case O(k*n); Average Case O(k*n); Worst Case O(k*n),
     *   where k is the length of the longest number and n is the
     *   size of the input array.
     *
     *   Note: if k is greater than log(n) then an n*log(n) algorithm would be a
     *         better fit. In reality we can always change the radix to make k
     *         less than log(n).
     *
     * Approach:
     *   radix sort, like counting sort and bucket sort, is an integer based
     *   algorithm (i.e. the values of the input array are assumed to be
     *   integers). Hence radix sort is among the fastest sorting algorithms
     *   around, in theory. The particular distinction for radix sort is that it
     *   creates a bucket for each cipher (i.e. digit); as such, similar to
     *   bucket sort, each bucket in radix sort must be a growable list that may
     *   admit different keys.
     *
     *   For decimal values, the number of buckets is 10, as the decimal system
     *   has 10 numerals/cyphers (i.e. 0,1,2,3,4,5,6,7,8,9). Then the keys are
     *   continuously sorted by significant digits.
     ***************************************************************************/
    public void radixsort(int[] input) {
        final int RADIX = 10;
        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        // sort
        boolean maxLength = false;
        int tmp = -1;
        int placement = 1;

        while (!maxLength) {
            maxLength = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    input[a++] = i;
                }
                bucket[b].clear();
            }
            // move to next digit
            placement *= RADIX;
        }
    }

    /*****************************************************************************
     * Author: Isai Damier
     * Title: Bucketsort
     * Project: geekviewpoint
     * Package: algorithms
     *
     * Statement:
     *   Given a disordered list of integers, rearrange them in natural order.
     *
     * Sample Input: {8,5,3,1,9,6,0,7,4,2,5}
     * Sample Output: {0,1,2,3,4,5,6,7,8,9,5}
     *
     * Time Complexity of Solution:
     *     Best Case O(n); Average Case O(n); Worst Case O(n).
     *
     * Approach:
     *   If it sounds too good to be true, then most likely it's not true.
     *   Bucketsort is not an exception to this adage. For bucketsort to work at
     *   its blazing efficiency, there are multiple prerequisites. First the
     *   hash function that is used to partition the elements need to be very
     *   good and must produce ordered hash: if i < k then hash(i) < hash(k).
     *   Second, the elements to be sorted must be uniformly distributed.
     *
     *   The aforementioned aside, bucket sort is actually very good considering
     *   that counting sort is reasonably speaking its upper bound. And counting
     *   sort is very fast. The particular distinction for bucket sort is that
     *   it uses a hash function to partition the keys of the input array, so
     *   that multiple keys may hash to the same bucket. Hence each bucket must
     *   effectively be a growable list; similar to radix sort.
     *
     *   Numerous Internet sites, including university pages, have erroneously
     *   written counting sort code and call them bucket sort. Bucket sort uses
     *   a hash function to distribute keys; counting sort creates a bucket for
     *   each key. Indeed there are perhaps greater similarities between radix
     *   sort and bucket sort, than there are between counting sort and bucket sort.
     *
     *   In the presented program Java's Collections.sort(C) is used to sort each
     *   bucket. This is to inculcate that the bucket sort algorithm does not
     *   specify which sorting technique to use on the buckets. A programmer may
     *   choose to continuously use bucket sort on each bucket until the
     *   collection is sorted (in the manner of the radix sort program below).
     *   Whichever sorting method is used on the buckets, bucket sort still
     *   tends toward O(n).
     *
     ****************************************************************************/
    public void bucketsort(int[] input) {
        //get hash codes
        final int[] code = hash(input);
        //create and initialize buckets to ArrayList: O(n)
        List<Integer>[] buckets = new List[code[1]];
        for (int i = 0; i < code[1]; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        //distribute data into buckets: O(n)
        for (int i : input) {
            buckets[hash(i, code)].add(i);
        }
        /**
         * Sort each bucket: O(n).
         * I mentioned above that the worst case for bucket sort is counting
         * sort. That's because in the worst case, bucket sort may end up
         * with one bucket per key. In such case, sorting each bucket would
         * take 1^2 = O(1). Even after allowing for some probabilistic
         * variance, to sort each bucket would still take 2-1/n, which is
         * still a constant. Hence, sorting all the buckets takes O(n).
         ***/
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int ndx = 0;
        //merge the buckets: O(n)
        for (int b = 0; b < buckets.length; b++) {
            for (int v : buckets[b]) {
                input[ndx++] = v;
            }
        }
    }

    private int[] hash(int[] input) {
        int m = input[0];
        for (int i = 1; i < input.length; i++) {
            if (m < input[i]) {
                m = input[i];
            }
        }
        return new int[]{m, (int) Math.sqrt(input.length)};
    }

    private int hash(int i, int[] code) {
        return (int) ((double) i / code[0] * (code[1] - 1));
    }

    /***************************************************************************
     * Author: Isai Damier
     * Title: Countingsort
     * Project: GeekViewpoint
     * Package: algorithms
     *
     * Statement:
     *   Given a disordered list of repeated integers, rearrange the integers
     *   in natural order.
     *
     * Sample Input: {4,3,2,1,4,3,2,4,3,4}
     *
     * Sample Output: {1,2,2,3,3,3,4,4,4,4}
     *
     * Time Complexity of Solution:
     *   Best Case O(n+k); Average Case O(n+k); Worst Case O(n+k),
     *   where n is the size of the input array and k means the
     *   values range from 0 to k.
     *
     * Approach:
     *   Counting sort, like radix sort and bucket sort,
     *   is an integer based algorithm (i.e. the values of the input
     *   array are assumed to be integers). Hence counting sort is
     *   among the fastest sorting algorithms around, in theory. The
     *   particular distinction for counting sort is that it creates
     *   a bucket for each value and keep a counter in each bucket.
     *   Then each time a value is encountered in the input collection,
     *   the appropriate counter is incremented. Because counting sort
     *   creates a bucket for each value, an imposing restriction is
     *   that the maximum value in the input array be known beforehand.
     *
     *   There is a great number of counting sort code on the Internet,
     *   including on university websites, that erroneously claim to be
     *   bucket sort. Bucket sort uses a hash function to distribute
     *   values; counting sort, on the other hand, creates a counter for
     *   each value -- hence the name.
     *
     * Implementation notes:
     *
     * 1] Since the values range from 0 to k, create k+1  buckets.
     * 2] To fill the buckets, iterate through the input array and
     *    each time a value appears, increment the counter in its
     *    bucket.
     * 3] Now fill the input array with the compressed data in the
     *    buckets. Each bucket's key represents a value in the
     *    array. So for each bucket, from smallest key to largest,
     *    add the index of the bucket to the input array and
     *    decrease the counter in said bucket by one; until the
     *    counter is zero.
     **************************************************************************/
    public void countingsort(int[] input, int k) {
        // create buckets
        int counter[] = new int[k + 1];
        // fill buckets
        for (int i : input) {
            counter[i]++;
        }
        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
    }
}
