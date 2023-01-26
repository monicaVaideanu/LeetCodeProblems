import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game/
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an
 * empty record. You are given a list of strings operations, where operations[i] is the ith operation you must apply to
 * the record and is one of the following:
 * <p>
 * An integer x.  -> Record a new score of x.
 * '+'. -> Record a new score that is the sum of the previous two scores.
 * 'D'. -> Record a new score that is the double of the previous score.
 * 'C'. -> Invalidate the previous score, removing it from the record.
 * <p>
 * Return the sum of all the scores on the record after applying all the operations.
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that
 * all operations are valid.
 */
public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                numbers.pop();
            } else if (operations[i].equals("D")) {
                int number = numbers.peek();
                numbers.push(number * 2);
            } else if (operations[i].equals("+")) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(b);
                numbers.push(a);
                numbers.push(a + b);
            } else {
                System.out.println(operations[i]);
                int nr = Integer.parseInt(operations[i]);
                numbers.push(nr);
            }
        }
        int sum = 0;
        while (!numbers.isEmpty()) {
            sum += numbers.pop();
        }
        return sum;
    }
}
