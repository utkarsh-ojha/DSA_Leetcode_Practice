package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/shuffle-string/
 */
public class RestoreString {
    public String restoreString(String s, int[] indices) {
        String[] temp = new String[s.length()];
        String output = "";
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = String.valueOf(s.charAt(i));
        }
        for (int j = 0; j < s.length(); j++) {
            output += temp[j];
        }

        return output;
    }
}
