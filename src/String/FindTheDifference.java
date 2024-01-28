package String;

/*
389. Find the Difference
Leetcode Link:https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        char element = 0;
        for (int i = 0; i < len; i++) {
            element ^= s.charAt(i);
            element ^= t.charAt(i);
        }
        return (char) (element ^ t.charAt(len));
    }
}
