package String;

/*
14. Longest Common Prefix
Leetcode Link: https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String output = "";

        int maxLengthtoIterate = Integer.MAX_VALUE;

        for (String element : strs) {
            if (element.length() < maxLengthtoIterate) {
                maxLengthtoIterate = element.length();
            }
        }
        for (int i = 0; i < maxLengthtoIterate; i++) {
            char toCheck = strs[0].charAt(i);
            for (int j = 0; j < len; j++) {
                if (toCheck == strs[j].charAt(i))
                    continue;
                else
                    return output;
            }
            output += String.valueOf(toCheck);
        }
        return output;
    }
}
