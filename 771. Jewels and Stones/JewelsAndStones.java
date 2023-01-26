import java.util.HashSet;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you
 * have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are
 * also jewels.
 * Letters are case-sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jew = new HashSet<Character>();
        for (int i = 0; i < jewels.length(); i++) {
            jew.add(jewels.charAt(i));
        }
        int counterStones = 0;
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (jew.contains(c)) {
                counterStones++;
            }
        }
        return counterStones;
    }
}
