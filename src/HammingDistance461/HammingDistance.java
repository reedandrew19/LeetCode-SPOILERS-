package HammingDistance461;

/**
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Note:
 * 0 ≤ x, y < 231.
 *
 * Example:
 *
 * Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * The above arrows point to positions where the corresponding bits are
 * different.
 *
 * Created by Andrew on 6/10/2018.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int hammingDistance = 0;

        for (int i = 0; i < 32; i++) {
            hammingDistance += ((x >> i) & 1) ^ ((y >> i) & 1);
        }

        return hammingDistance;
    }

    public static int hammingDistanceConcise(int x, int y) {
        int hammingDistance = 0;
        int xor = x ^ y;

        for(int i = 0; i < 32; i++){
            hammingDistance += xor % 2;

            xor = xor >> 1;
        }

        return hammingDistance;
    }
}
/**
 * Two things I learned from this problem. The first is a small thing that I
 * should know but forgot because I haven't dealt with bit manipulation in a
 * while; when you do n % 2, if the number is 0, the ending bit is 0, if it's
 * 1, the ending bit is 1.
 *
 * The second is, once again, to look at the constraints of the problem. I
 * began working on the problem a while ago, so I didn't recall the constraint
 * that the integer would be unsigned. This allows us to do the mod 2 without
 * worrying about the negative cases.
 */