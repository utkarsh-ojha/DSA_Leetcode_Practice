package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/
 */
public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int max = -1;

        for (int i = 0; i < sentences.length; i++) {
            String temp[] = sentences[i].split(" ");
            if (max < temp.length) {
                max = temp.length;
            }
        }
        return max;
    }
}
