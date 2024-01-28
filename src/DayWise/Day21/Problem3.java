package DayWise.Day21;

import java.util.HashSet;

/*
Leetcode link: https://leetcode.com/problems/unique-morse-code-words/description/
 */
public class Problem3 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
                ".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."
        };
        HashSet<String> output = new HashSet<String>();
        int len = words.length;
        String morseForWord = "";

        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                morseForWord += morse[(int) word.charAt(j) - 'a'];
            }
            output.add(morseForWord);
            morseForWord = "";
        }

        return output.size();
    }
}
