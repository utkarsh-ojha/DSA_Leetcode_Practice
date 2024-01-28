package DayWise.Day11;

/*
Leetcode Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */

public class Problem2 {

    public boolean checkIfPangram(String sentence) {
        char first = 'a';
        for (int i = 0; i < 26; i++) {
            if (sentence.contains(String.valueOf(first))) {
                first++;
            } else return false;
        }
        return true;
    }
}
