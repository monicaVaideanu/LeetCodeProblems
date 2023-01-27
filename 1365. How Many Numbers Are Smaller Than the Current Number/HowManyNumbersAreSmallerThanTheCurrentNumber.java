/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is,
 * for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] toReturn = new int[nums.length];
        for (int i = 0; i < toReturn.length; i++) {
            int check = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (check > nums[j]) {
                    toReturn[i]++;
                }
            }
        }
        return toReturn;
    }
}
