/**
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 * Given an array of strings words, return the first palindromic string in the array.
 * If there is no such string, return an empty string "".
 * A string is palindromic if it reads the same forward and backward.
 */
public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (palindromOrNot(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    public boolean palindromOrNot(String wordToVerify) {
        StringBuilder sb = new StringBuilder();
        for (int i = wordToVerify.length() - 1; i >= 0; i--) {
            sb.append(wordToVerify.charAt(i));
        }
        return sb.toString().equals(wordToVerify);
    }
}
