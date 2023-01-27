/**
 * https://leetcode.com/problems/fibonacci-number/
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */
public class FibonacciNumber {
    public int fib(int n) {
        if (n == 0) {
            return n;
        }
        if (n == 1) {
            return 1;
        }
        int fN1 = 0;
        int fN2 = 1;
        int r = 0;
        for (int i = 1; i < n; i++) {
            r = fN1 + fN2;
            fN1 = fN2;
            fN2 = r;
        }
        return r;
    }
}
