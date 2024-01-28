package String;

import java.util.Arrays;

/*
242. Valid Anagram
Leetcode Link:https://leetcode.com/problems/valid-anagram/
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int lengthS = s.length();
        int lengthT = t.length();
        if (lengthS != lengthT) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < lengthS; i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;
    }
}

