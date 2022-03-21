package MergeSortedArray88;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int lastMergedIndex = nums1.length - 1;
        int lastLeftArrayIndex = m - 1;
        int lastRightArrayIndex = n - 1;

        while(lastLeftArrayIndex >= 0 && lastRightArrayIndex >= 0){
            if(nums1[lastLeftArrayIndex] >= nums2[lastRightArrayIndex]){
                nums1[lastMergedIndex] = nums1[lastLeftArrayIndex];
                lastLeftArrayIndex -= 1;
            }else{
                nums1[lastMergedIndex] = nums2[lastRightArrayIndex];
                lastRightArrayIndex -= 1;
            }

            lastMergedIndex -= 1;
        }

        while(lastLeftArrayIndex >= 0){
            nums1[lastMergedIndex] = nums1[lastLeftArrayIndex];
            lastLeftArrayIndex -= 1;
            lastMergedIndex -= 1;
        }

        while(lastRightArrayIndex >= 0){
            nums1[lastMergedIndex] = nums2[lastRightArrayIndex];
            lastRightArrayIndex -= 1;
            lastMergedIndex -= 1;
        }
    }

    public static void mergeBetter(int[] nums1, int m, int[] nums2, int n){
        int nums1HighestIndex = m - 1;
        int nums2HighestIndex = n - 1;

        for(int i = m + n - 1; i >= 0; i--){
            if(nums2HighestIndex < 0){
                break;
            }

            if(nums1HighestIndex >= 0 && nums1[nums1HighestIndex] >= nums2[nums2HighestIndex]){
                nums1[i] = nums1[nums1HighestIndex];
                nums1HighestIndex -= 1;
            }else{
                nums1[i] = nums2[nums2HighestIndex];
                nums2HighestIndex -= 1;
            }
        }
    }
}
/**
 * I once again didn't read the question carefully enough and missed the very important piece of information that the
 * arrays were already sorted. I was worried I'd need to somehow keep track of ordering while merging the arrays, which
 * lead me to believe heaps would be useful here. however, because the arrays are already sorted, I am able to find a
 * solution in n time using 3 pointers. In all of the cases where I haven't read the instructions, however, it's because
 * I've already read the instructions a day or two before attempting the problem, thinking I already understand the ask.
 * With this problem appearing twice in a row, I believe I've learned my lesson and it won't happen again for some time,
 * but only time will tell.
 *
 * My while loop solution was fast, however not very clean, there's a better way to do it however when we realize that
 * if nums2 is done being input into nums1, the rest of the nums1 is already sorted, so the program is finished. Related
 * note: when dealing with arrays, watch out for indexOutOfBoundsExceptions.
 */