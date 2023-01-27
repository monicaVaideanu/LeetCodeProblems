import java.util.ArrayList;

/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists
 * from left to right to generate the decompressed list.
 * <p>
 * Return the decompressed list.
 */
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq != 0) {
                arr.add(val);
                freq--;
                count++;
            }
        }
        int[] arrToReturn = new int[count];
        for (int i = 0; i < arrToReturn.length; i++) {
            arrToReturn[i] = arr.get(i);
        }
        return arrToReturn;
    }
}
