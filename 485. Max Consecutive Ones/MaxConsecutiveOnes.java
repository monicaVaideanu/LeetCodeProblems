import java.util.HashMap;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!num.containsKey(nums[i])) {
                num.put(nums[i], 1);
            } else {
                int a = num.get(nums[i]) + 1;
                num.put(nums[i], a);
            }
        }
        int max = 0;
        int prevMax = 0;
        for (int i = 0; i < nums[i]; i++) {
            max = num.get(nums[i]);
            if (max > prevMax) {
                prevMax = max;
            }
        }
        return prevMax > max ? prevMax : max;
    }
}
