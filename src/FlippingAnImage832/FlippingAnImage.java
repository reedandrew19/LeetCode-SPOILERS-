package FlippingAnImage832;

/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert
 * it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is
 * replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * Example 1:
 *
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * Example 2:
 *
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row:
 * [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * Notes:
 *
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 *
 * Created by Andrew on 6/5/2018.
 */
public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        int mask = 0x00000001;
        int[][] flip = new int[A.length][];

        for(int i = 0; i < A.length; i++){
            int[] newRow = new int[A[i].length];
            for(int j = 0; j < A[i].length; j++){
                newRow[j] = A[i][A[i].length - j - 1] ^ mask;
            }
            flip[i] = newRow;
        }

        return flip;
    }
}
/**
 * When working on this solution, I understood that this solution could be
 * solved by using A and using a temp array for the row (you can even use a
 * temp array of size one half the array in A, something I had not considered
 * until looking at the official answer), but I prefer to return a new 2D array
 * because it reduces side affects due to being more functional.
 */