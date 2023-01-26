/*
https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.
*/
public class MaximumCountOfPositiveAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int counterPlus = 0;
        int counterNeg = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 0) {
                counterNeg++;
            } else if (nums[i] > 0){
                counterPlus = nums.length -i;
                break;
            }
        }
        return counterNeg >= counterPlus ? counterNeg : counterPlus;
    }
}
