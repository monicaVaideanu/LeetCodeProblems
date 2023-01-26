/**
 * https://leetcode.com/problems/count-integers-with-even-digit-sum/
 * Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
 * The digit sum of a positive integer is the sum of all its digits.
 */
public class CountIntegersWithEvenDigitSum {
    public int countEven(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (i < 9 && i % 2 == 0) {
                counter++;
            } else if (i >= 10 && evenNumberSum(i)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean evenNumberSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 2 == 0;
    }
}

