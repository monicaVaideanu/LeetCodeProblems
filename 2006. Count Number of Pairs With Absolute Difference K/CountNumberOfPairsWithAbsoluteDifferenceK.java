/**
 * https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
 * Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such
 * that |nums[i] - nums[j]| == k.
 * The value of |x| is defined as:
 * <p>
 * x if x >= 0.
 * -x if x < 0.
 */
public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public int countKDifference(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i < j && Math.abs(nums[i] - nums[j]) == k) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
