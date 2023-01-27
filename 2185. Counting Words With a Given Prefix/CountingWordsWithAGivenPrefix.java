/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/
 * You are given an array of strings words and a string pref.
 * Return the number of strings in words that contain pref as a prefix.
 * A prefix of a string s is any leading contiguous substring of s.
 */
public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            if (sb.indexOf(pref) == 0) {
                counter++;
            }
        }
        return counter;
    }
}
