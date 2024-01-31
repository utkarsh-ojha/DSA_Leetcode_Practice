package Stack;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> tempOutput = new Stack<>();
        for (char element : s.toCharArray()) {
            if (
                    (!tempOutput.isEmpty() && tempOutput.peek() == '(' && element == ')') ||
                            (!tempOutput.isEmpty() && tempOutput.peek() == '[' && element == ']') ||
                            (!tempOutput.isEmpty() && tempOutput.peek() == '{' && element == '}')
            ) {
                tempOutput.pop();
            } else tempOutput.push(element);
        }
        return tempOutput.isEmpty();
    }
}
