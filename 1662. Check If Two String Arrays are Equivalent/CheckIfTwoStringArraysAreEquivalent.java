/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * <p>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 */
public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < word1.length; i++) {
            s1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            s2 += word2[i];
        }
        return s1.equals(s2);
    }
}
