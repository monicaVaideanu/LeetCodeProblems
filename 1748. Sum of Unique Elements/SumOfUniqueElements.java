/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.
 */
import java.util.HashMap;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> freqNr = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!freqNr.containsKey(nums[i])) {
                freqNr.put(nums[i], 1);
            } else {
                int nrOfApprennce = freqNr.get(nums[i]) + 1;
                freqNr.put(nums[i], nrOfApprennce);
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int get = freqNr.get(nums[i]);
            if (get == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
