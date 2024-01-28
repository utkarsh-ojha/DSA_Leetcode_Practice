package DayWise.Day5;

import java.util.Arrays;

/*
Leetcode Link: https://leetcode.com/problems/valid-anagram/description/
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

 */
public class Problem1 {

    public static void main(String[] args) {
        boolean result = isAnagram("test","estt");
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
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
