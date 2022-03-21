public class BinarySearch {
    public static int search(int[] nums, int target) {
        int minIndex = 0;
        int maxIndex = nums.length - 1;

        while (minIndex <= maxIndex) {
            int halvedIndex = minIndex + (maxIndex - minIndex) / 2;

            if (nums[halvedIndex] == target) {
                return halvedIndex;
            } else if (target < nums[halvedIndex]) {
                maxIndex = halvedIndex - 1;
            } else {
                minIndex = halvedIndex + 1;
            }
        }

        return -1;
    }

    public static int searchRecursive(int[] nums, int target){
        return searchRecursive(nums, target, 0, nums.length - 1);
    }

    private static int searchRecursive(int[] nums, int target, int left, int right){
        int pivot = left + (right - left) / 2;

        if(target == nums[pivot]){
            return pivot;
        }else if(left > right){
            return -1;
        }else if(target < nums[pivot]){
            return searchRecursive(nums, target, left, pivot - 1);
        }else{
            return searchRecursive(nums, target, pivot + 1, right);
        }
    }
}

/**
 * This problem.... gave me a bit of trouble. Maybe it's because I haven't implemented a binary search in so long, but
 * there were several things I got wrong about the implementation: changing the left and right pointers to start before
 * or after the pivot and not on the pivot, the condition to return -1 being when the left pointer is greater than the
 * right. Once I solved the first problem, I had trouble implementing it recursively because I forgot to return the
 * recursive function, not just call it. The recursive function did come much more easily, however. Hopefully this is
 * one of those problems that will come much more easily in the future now that I've derusted the information.
 */