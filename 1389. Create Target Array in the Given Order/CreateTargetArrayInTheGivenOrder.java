import java.util.ArrayList;

/**
 * https://leetcode.com/problems/create-target-array-in-the-given-order/
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 * <p>
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.
 * <p>
 * It is guaranteed that the insertion operations will be valid.
 */
public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            toReturn.add(index[i], nums[i]);
        }
        int[] targetArray = new int[toReturn.size()];
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = toReturn.get(i);
        }
        return targetArray;
    }
}
