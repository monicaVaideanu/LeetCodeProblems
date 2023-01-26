import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/fizz-buzz/
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        Stack<String> toReturn = new Stack<>();
        for (int i = 1; i <= n; i++) {
            toReturn.add(options(i));
        }
        return toReturn;
    }

    public String options(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }
        return "" + n;
    }
}
