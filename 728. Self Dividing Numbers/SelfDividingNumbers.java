/** A self-dividing number is a number that is divisible by every digit it contains.

 For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 A self-dividing number is not allowed to contain the digit zero.

 Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
 Example:
 Input: left = 1, right = 22
 Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
 Example 2:

 Input: left = 47, right = 85
 Output: [48,55,66,77]
 https://leetcode.com/problems/self-dividing-numbers/
 * */

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfNr = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (checkNr(i)) {
                selfNr.add(i);
            }
        }
        for (int i = 0; i < selfNr.size(); i++) {
            System.out.print(selfNr.get(i) + " ");
        }
        return selfNr;
    }

    public boolean checkNr(int nr) {
        int copyNr = nr;
        while (copyNr != 0) {
            int lD = copyNr % 10;
            copyNr /= 10;
            if (lD == 0) {
                return false;
            }
            if (nr % lD != 0) {
                return false;
            }
        }
        return true;
    }
}
