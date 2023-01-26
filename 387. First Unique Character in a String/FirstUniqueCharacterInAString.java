import java.util.HashMap;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!characters.containsKey(c)) {
                characters.put(c, 1);
            } else {
                int value = characters.get(c) + 1;
                characters.put(c, value);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characters.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }
}
