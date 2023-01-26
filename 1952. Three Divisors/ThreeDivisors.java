/**
 * https://leetcode.com/problems/three-divisors/
 * Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 * <p>
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 */
public class ThreeDivisors {
    public boolean isThree(int n) {
        int div = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                div++;
            }
            if (div == 4) {
                return false;
            }
        }
        return div == 3;
    }
}
