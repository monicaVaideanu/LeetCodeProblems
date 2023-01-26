import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/happy-number/
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not
 * include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        int sum = 0;
        List<Integer> myList = new ArrayList<>();
        while (n != 1) {
            myList.add(n);
            sum = 0;
            int copy = n;
            while (copy > 0) {
                int aux = copy % 10;
                sum = sum + aux * aux;
                copy /= 10;
            }
            if (myList.contains(sum)) {
                return false;
            }
            n = sum;
        }
        return true;
    }
}
