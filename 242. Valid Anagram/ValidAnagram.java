import java.util.HashMap;

/***
 * https://leetcode.com/problems/valid-anagram/
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
 * all the original letters exactly once
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> sHash = new HashMap<>();
        HashMap<Character, Integer> tHash = new HashMap<>();
        populateHashMap(s, sHash);
        populateHashMap(t, tHash);
        for (int i = 0; i < s.length();i++){
            if (!tHash.containsKey(s.charAt(i))) {
                return false;
            }
            int vS = sHash.get(s.charAt(i));
            int vT = tHash.get(s.charAt(i));
            if (vT != vS){
                return false;
            }
        }
        return true;
    }

    public void populateHashMap(String s, HashMap<Character, Integer> sHash) {
        for (int i = 0; i < s.length(); i++){
            if (sHash.containsKey(s.charAt(i))){
                int value = sHash.get(s.charAt(i)) + 1;
                sHash.put(s.charAt(i) , value);
            } else {
                sHash.put(s.charAt(i),1);
            }
        }
    }
}
