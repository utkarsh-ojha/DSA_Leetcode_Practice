package Arrays;

import java.util.HashSet;

/*
804. Unique Morse Code Words
Leetcode Link:https://leetcode.com/problems/unique-morse-code-words/
*/
public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
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

