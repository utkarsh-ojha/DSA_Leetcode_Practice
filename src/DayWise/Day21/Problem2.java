package DayWise.Day21;

/*
Leetcode Link : https://leetcode.com/problems/number-of-lines-to-write-string/description/
 */
public class Problem2 {
    public int[] numberOfLines(int[] widths, String s) {
        int midSum = 0;
        int len = s.length();
        int line = 1;
        for (int i = 0; i < len; i++) {
            if (midSum <= 100 && (midSum + widths[s.charAt(i) - 'a']) <= 100) {
                midSum += widths[s.charAt(i) - 'a'];
            } else {
                line++;
                midSum = 0;
                midSum += widths[s.charAt(i) - 'a'];
            }
        }
        int[] out = new int[2];
        out[0] = line;
        out[1] = midSum;
        return out;
    }
}

