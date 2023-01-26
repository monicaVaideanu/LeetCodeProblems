import java.util.HashMap;

/**
 * https://leetcode.com/problems/first-letter-to-appear-twice/
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 * Note:
 * A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
 * s will contain at least one letter that appears twice.
 */
public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> v = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!v.containsKey(s.charAt(i))) {
                v.put(s.charAt(i), 1);
            } else {
                return s.charAt(i);
            }
        }
        return 'a';
    }
}
