/**
 * No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
 * <p>
 * Given an integer n, return a list of two integers [a, b] where:
 * a and b are No-Zero integers.
 * a + b = n
 * The test cases are generated so that there is at least one valid solution. If there are many valid solutions,
 * you can return any of them.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: [1,1]
 * Explanation: Let a = 1 and b = 1.
 * Both a and b are no-zero integers, and a + b = 2 = n.
 * Example 2:
 * <p>
 * Input: n = 11
 * Output: [2,9]
 * Explanation: Let a = 2 and b = 9.
 * Both a and b are no-zero integers, and a + b = 9 = n.
 * Note that there are other valid answers as [8, 3] that can be accepted.
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
        int[] arrToReturn = new int[2];

        for (int i = 1; i < n; i++) {
            String checkI = i + "";
            if (checkI.contains("0")) {
                continue;
            }
            int x = n - i;
            String s = x + "";
            if (s.contains("0")) {
                continue;
            }
            if (x + i == n) {
                arrToReturn[0] = x;
                arrToReturn[1] = i;
                break;
            }
        }
        return arrToReturn;
    }
}
