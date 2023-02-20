/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */

public class NeedleAndHaystack {
    public static void main(String[] args) {
        String test1 = "abc";
        String searchNeedle1 = "c";

        String test2 = "a";
        String searchNeedle2 = "a";
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) {
            return 0;
        }
        if (haystack.contains(needle)) {
            int n = needle.length();
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.substring(i, i + n).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}



