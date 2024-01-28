package String;

/*
171. Excel Sheet Column Number
Leetcode Link: https://leetcode.com/problems/excel-sheet-column-number/
 */
public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int output = 0;
        for (int i = 0; i < len; i++) {
            output = output * 26;
            output += columnTitle.charAt(i) - 64;
        }
        return output;
    }
}
