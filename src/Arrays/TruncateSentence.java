package Arrays;

/*
Leetcode Link : https://leetcode.com/problems/truncate-sentence/description/
 */
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] temp = s.split(" ");
        String output = "";
        for (int i = 0; i < k; i++) {
            output += temp[i] + " ";
        }
        return output.trim();
    }
}
