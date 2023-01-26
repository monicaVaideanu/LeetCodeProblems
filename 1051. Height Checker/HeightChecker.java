import java.util.Arrays;

/**
 * https://leetcode.com/problems/height-checker/
 * A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith
 * student in line. You are given an integer array heights representing the current order that the students are
 * standing in. Each heights[i] is the height of the ith student in line (0-indexed).
 * <p>
 * Return the number of indices where heights[i] != expected[i].
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] copyH = new int[heights.length];
        System.arraycopy(heights, 0, copyH, 0, heights.length);
        Arrays.sort(copyH);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (copyH[i] != heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}
