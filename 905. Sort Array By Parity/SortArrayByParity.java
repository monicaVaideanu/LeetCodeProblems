/**
 *https://leetcode.com/problems/sort-array-by-parity/
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 */

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int [] numsCopy = new int [nums.length];
        int iterator = 0;
        for (int i = 0; i < nums.length;i++){
            if (nums[i] % 2 == 0){
                numsCopy[iterator] = nums[i];
                iterator++;
            }
        }
        for (int i = 0; i < nums.length;i++){
            if (nums[i] % 2 != 0){
                numsCopy[iterator] = nums[i];
                iterator++;
            }
        }
        return numsCopy;
    }
}
