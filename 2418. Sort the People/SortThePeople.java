import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/sort-the-people/
 * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
 * <p>
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * <p>
 * Return names sorted in descending order by the people's heights.
 */
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> sortHash = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            sortHash.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int j = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            names[j] = sortHash.get(heights[i]);
            j++;
        }
        return names;
    }
}
