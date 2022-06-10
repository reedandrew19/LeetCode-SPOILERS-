package KClosestPointstoOrigin973;

import java.util.Arrays;

public class KClosestPointsToOrigin {
    public static int[][] kClosest(int[][] points, int k){
        int left = 0;
        int right = points.length - 1;
        int pivotIndex = points.length;
        while(pivotIndex != k) {

            pivotIndex = partition(points, left, right);

            if (pivotIndex < k) {
                left = pivotIndex;
            } else {
                right = pivotIndex - 1;
            }
        }

        return Arrays.copyOf(points, k);
    }

    private static int partition(int[][] points, int left, int right){
        int[] pivot = choosePivot(points, left, right);
        int pivotDist = squaredDistance(pivot);

        while(left < right){
            if(squaredDistance(points[left]) >= pivotDist){
                int[] tempRightPoint = points[right];
                points[right] = points[left];
                points[left] = tempRightPoint;
                right -= 1;
            }else{
                left += 1;
            }
        }

        if(squaredDistance(points[left]) < pivotDist){
            left += 1;
        }
        return left;
    }

    private static int[] choosePivot(int[][] points, int left, int right){
        return points[left + (right - left) / 2];
    }

    private static int squaredDistance(int[] points){
        return points[0] * points[0] + points[1] * points[1];
    }
}
