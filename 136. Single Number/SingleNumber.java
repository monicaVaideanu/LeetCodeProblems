import java.util.HashSet;

/**
 * https://leetcode.com/problems/single-number/
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int toReturn = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                toReturn = nums[i];
                break;
            }
        }
        return toReturn;
    }
}
