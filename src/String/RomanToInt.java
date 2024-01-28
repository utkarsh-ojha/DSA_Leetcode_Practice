package String;

import java.util.HashMap;
import java.util.Map;

/*
13. Roman to Integer
Leetcode Link: https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int len = s.length();
        int num = 0;
        int previousValue = 0;
        for (int i = len - 1; i >= 0; i--) {
            int newValue = roman.get(String.valueOf(s.charAt(i)));

            // Check if the current character's value is less than the previous character's value
            if (newValue < previousValue) {
                // If yes, subtract the value of the current character from num.
                num -= newValue;
            }
            // If no, add the value of the current character to the num
            else num += newValue;

            previousValue = newValue;
        }
        return num;
    }
}
