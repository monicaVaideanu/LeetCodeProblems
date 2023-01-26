import java.util.Arrays;

/**
 *https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * You are given an integer array nums with the following properties:
 *          nums.length == 2 * n.
 *          nums contains n + 1 unique elements.
 * Exactly one element of nums is repeated n times.
 * Return the element that is repeated n times.
 * */
public class NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] nums) {
        int counter = 0;
        int verifyNr = nums.length/2-1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                counter++;
                if (counter == verifyNr){
                    return nums[i];
                }
            } else {
                counter = 0;
            }
        }
        return 0;
    }
}
