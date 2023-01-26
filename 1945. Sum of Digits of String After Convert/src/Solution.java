/*https://leetcode.com/problems/sum-of-digits-of-string-after-convert/

You are given a string s consisting of lowercase English letters, and an integer k.

First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.

For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.

*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
       getLucky("leetcode",2);
    }
    public static int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int append = ((int) s.charAt(i)) - 96;
            sb.append(append);
        }
        for(int i = 0; i < sb.length();i++)  {
            sum += sb.charAt(i) - 48;
        }
        System.out.println(sum);
        int sumOfDigits = 0;

        for (int i = 1 ; i <= k ; i++){
            while (sum != 0){
                sumOfDigits += sum % 10;
                sum /= 10;
            }
            sum = sumOfDigits;
            sumOfDigits = 0;
        }
        return sum;
    }
}
