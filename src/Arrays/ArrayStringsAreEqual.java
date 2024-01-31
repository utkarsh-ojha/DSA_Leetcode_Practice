package Arrays;

/*
Leetcode Link:https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
public class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = "";
        String wordTwo = "";
        for (int i = 0; i < word1.length; i++) {
            wordOne += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            wordTwo += word2[i];
        }

        return wordOne.equals(wordTwo);
    }
}
