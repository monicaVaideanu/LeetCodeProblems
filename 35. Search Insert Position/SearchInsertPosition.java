/**
 * https://leetcode.com/problems/search-insert-position/
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int middle = (l + r) / 2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                r = middle - 1;
            } else if (target > nums[middle]) {
                l = middle + 1;
            }
        }
        return l;
    }
}
