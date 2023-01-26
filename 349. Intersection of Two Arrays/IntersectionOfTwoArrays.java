import java.util.HashSet;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be
 * unique and you may return the result in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        HashSet<Integer> s2 = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }
        s1.retainAll(s2);

        int arraySize = s1.size();
        Integer[] arr = new Integer[arraySize];
        arr = s1.toArray(arr);
        int[] returnArr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            returnArr[i] = arr[i];
        }
        return returnArr;
    }
}
