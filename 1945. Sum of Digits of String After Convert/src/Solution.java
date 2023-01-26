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
