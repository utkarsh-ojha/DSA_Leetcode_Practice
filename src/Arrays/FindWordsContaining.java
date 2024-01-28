package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
2942. Find Words Containing Character
Leetcode Link: https://leetcode.com/problems/find-words-containing-character/
 */
public class FindWordsContaining {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                output.add(i);
            }
        }
        return output;
    }
}
