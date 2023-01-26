import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/keyboard-row/
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of
 * American keyboard like the image below.
 * <p>
 * In the American keyboard:
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 */
public class KeyboardRow {
    public String[] findWords(String[] words) {
        ArrayList<String> arr = new ArrayList<String>();
        Character[] r1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        Character[] r2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        Character[] r3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        Set<Character> row1 = new HashSet<Character>(Arrays.asList(r1));
        Set<Character> row2 = new HashSet<Character>(Arrays.asList(r2));
        Set<Character> row3 = new HashSet<Character>(Arrays.asList(r3));

        for (int i = 0; i < words.length; i++) {
            boolean f1 = isWordFromThisRow(words[i], row1);
            boolean f2 = isWordFromThisRow(words[i], row2);
            boolean f3 = isWordFromThisRow(words[i], row3);
            if (f1 || f2 || f3) {
                arr.add(words[i]);
            }
        }
        arr.trimToSize();
        String[] arrToReturn = new String[arr.size()];
        for (int i = 0; i < arrToReturn.length; i++) {
            arrToReturn[i] = arr.get(i);
        }
        return arrToReturn;
    }

    public static boolean isWordFromThisRow(String word, Set<Character> row) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (row.contains(word.charAt(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
