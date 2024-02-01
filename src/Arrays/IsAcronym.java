package Arrays;

import java.util.List;

/*
Leetcode Link: https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
 */
public class IsAcronym {
    public boolean isAcronym(List<String> words, String s) {
        String tempString = "";
        for (int i = 0; i < words.size(); i++) {
            tempString += String.valueOf(words.get(i).charAt(0));
        }

        return tempString.equals(s);
    }
}
