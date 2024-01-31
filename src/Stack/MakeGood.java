package Stack;

import java.util.Stack;

/*
Leetcode Link: https://leetcode.com/problems/make-the-string-great/description/
 */
public class MakeGood {
    public String makeGood(String s) {
        Stack<Character> temp = new Stack<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!temp.isEmpty() && temp.peek() != s.charAt(i)) {
                if (String.valueOf(temp.peek()).toLowerCase().equals(String.valueOf(s.charAt(i)).toLowerCase())) {
                    temp.pop();
                } else temp.push(s.charAt(i));
            } else temp.push(s.charAt(i));
        }
        StringBuilder output = new StringBuilder();
        for (int j = 0; j < temp.size(); j++) {
            output.append(temp.get(j));
        }
        return output.toString();
    }
}
