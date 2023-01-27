/**
 * https://leetcode.com/problems/maximum-69-number/
 * You are given a positive integer num consisting only of digits 6 and 9.
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */
public class Maximum69Number {
    public int maximum69Number(int num) {
        int fourthDigit = num % 10;
        num /= 10;
        int thirdDigit = num % 10;
        num /= 10;
        int secondDigit = num % 10;
        num /= 10;
        int firstDigit = num % 10;
        if (firstDigit == 6) {
            firstDigit = 9;
        } else if (secondDigit == 6) {
            secondDigit = 9;
        } else if (thirdDigit == 6) {
            thirdDigit = 9;
        } else if (fourthDigit == 6) {
            fourthDigit = 9;
        }
        int toReturn = firstDigit * 1000 + secondDigit * 100 + thirdDigit * 10 + fourthDigit;
        return toReturn;
    }
}
