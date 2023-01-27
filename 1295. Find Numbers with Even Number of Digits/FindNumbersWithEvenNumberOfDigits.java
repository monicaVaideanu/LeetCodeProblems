/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int nr = nums[i];
            if (nr >= 10 && nr <= 99) {
                counter++;
            } else if (nr >= 1000 && nr <= 9999) {
                counter++;
            } else if (nr == 100000) {
                counter++;
            }
        }
        return counter;
    }
}
