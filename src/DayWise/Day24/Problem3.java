package DayWise.Day24;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    public static void main(String[] args) {
        boolean result = wordPattern("abba", "dog cat cat fish");
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] sInArry = s.split(" ");

        if (pattern.length() != sInArry.length) {
            return false;
        }

        Map<Character, String> charPatternToStringPattern = new HashMap<>();
        Map<String, Character> StringPatternToCharPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            charPatternToStringPattern.put(pattern.charAt(i), sInArry[i]);
            StringPatternToCharPattern.put(sInArry[i], pattern.charAt(i));
        }

        for (int j = 0; j < pattern.length(); j++) {
            String temp = charPatternToStringPattern.get(pattern.charAt(j));
            if (pattern.charAt(j) != StringPatternToCharPattern.get(temp)) return false;
        }
        return true;
    }
}
