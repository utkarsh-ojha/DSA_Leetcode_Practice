package Arrays;
/*
Leetcode Link : https://leetcode.com/problems/reverse-vowels-of-a-string/
 */

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        List<Character> vowel = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        ArrayList<Integer> indexList = new ArrayList<>();
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (vowel.contains(temp[i])) {
                indexList.add(i);
            }
        }
        int numberOfVowelsPresent = indexList.size();
        for (int j = 0; j < numberOfVowelsPresent / 2; j++) {
            char c = temp[indexList.get(j)];
            temp[indexList.get(j)] = temp[indexList.get(numberOfVowelsPresent - 1 - j)];
            temp[indexList.get(numberOfVowelsPresent - 1 - j)] = c;
        }

        return String.valueOf(temp);
    }
}
