package KthLargestElementInAStream703;

import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> heap;
    private int heapSize;

    public KthLargest(int k, int[] nums){
        heap = new PriorityQueue();
        heapSize = k;

        for(int val : nums){
            addOrIgnoreNumber(val);
        }
    }

    public int add(int val){
        addOrIgnoreNumber(val);
        return heap.peek();
    }

    private void addOrIgnoreNumber(int number){
        if(heap.peek() == null || heap.size() < heapSize){
            heap.add(number);
        }else if(number > heap.peek()){
            heap.remove();
            heap.add(number);
        }
    }
}

/**
 * We could store as a LinkedList, only storing the k largest elements, but that would mean we would have to traverse
 * over the entire k size list in the worst case while adding. It's better to use a Heap
 *
 * In the initializer, we create a Min Heap of size k and put the nums array inside it.
 * when we add, we check if the new element is larger than the top element.
 *      if it is, then pop the heap, add the new number to the heap, and return the number that's peeked
 *      else, don't add and return the peeked number
 *
 * This will give us nlogn time for initial creation, log n for adding, and k space
 */

/**
 * I got the correct, optimal answer but there were bugs. I'll need to work on that (to be fair, I'm programming while
 * on a train and a friend is talking with us).
 */