/** https://leetcode.com/problems/plus-one/
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
 * the integer. The digits are ordered from most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

        boolean flag = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                flag = false;
                break;
            }
        }
        if (flag) {
            int[] tr = new int[digits.length + 1];
            tr[0] = 1;
            return tr;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}
