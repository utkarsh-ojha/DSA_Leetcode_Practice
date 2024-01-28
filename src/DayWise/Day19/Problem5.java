package DayWise.Day19;


/*
Leetcode Link: https://leetcode.com/problems/find-words-containing-character/
 */

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))){
                output.add(i);
            }
        }
        return output;
    }

}
