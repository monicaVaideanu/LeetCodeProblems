/** Given a string s, return true if s is a good string, or false otherwise.

 A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same
 frequency).
 Example 1:

 Input: s = "abacbc"
 Output: true
 Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
 Example 2:

 Input: s = "aaabb"
 Output: false
 Explanation: The characters that appear in s are 'a' and 'b'.
 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 * */

import java.util.HashMap;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hashS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashS.containsKey(s.charAt(i))) {
                int frequency = hashS.get(s.charAt(i)) + 1;
                hashS.put(s.charAt(i), frequency);
            } else {
                hashS.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (!hashS.get(s.charAt(i)).equals(hashS.get(s.charAt(i + 1)))) {
                return false;
            }
        }
        return true;
    }
}
