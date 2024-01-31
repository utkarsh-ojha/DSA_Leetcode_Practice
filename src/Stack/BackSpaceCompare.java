package Stack;

import java.util.Stack;

/*
Leetcode Link :https://leetcode.com/problems/backspace-string-compare/
 */
public class BackSpaceCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sTemp = new Stack<>();
        Stack<Character> tTemp = new Stack<>();
        for (char element : s.toCharArray()) {
            if (!sTemp.isEmpty() && element == '#') sTemp.pop();
            else if (element != '#') sTemp.push(element);
        }
        for (char element : t.toCharArray()) {
            if (!tTemp.isEmpty() && element == '#') tTemp.pop();
            else if (element != '#') tTemp.push(element);
        }
        if (sTemp.size() == tTemp.size()) {
            for (int i = 0; i < sTemp.size(); i++) {
                if (!tTemp.get(i).equals(sTemp.get(i))) {
                    return false;
                }
            }
        } else return false;

        return true;
    }
}
