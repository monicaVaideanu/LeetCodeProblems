/**
 * https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
 * Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j)
 * where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 */
public class CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
