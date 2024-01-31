package String;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("abbcddcb");
    }

//    public static String removeDuplicates(String s) {
//        return deleteDuplicateRecursively(s);
//    }

    /*
    //Recursive solution
    public static String deleteDuplicateRecursively(String input) {
        char[] sArr = input.toCharArray();
        String output = "";
        for (int i = 0; i < input.length(); ) {
            if (i == input.length() - 1) {
                output += sArr[i];
                break;
            } else if (sArr[i] != sArr[i + 1]) {
                output = output + sArr[i];
                i = i + 1;
            } else {
                i = i + 2 <= input.length() ? i + 2 : i + 1;
            }
        }
        if (input.equals(output)) return output;
        return deleteDuplicateRecursively(output);
    }
*/
    //2nd solution using stack.
    public static String removeDuplicates(String s) {
        StringBuilder output = new StringBuilder();
        Stack<Character> tempStore = new Stack<>();
        for (char element : s.toCharArray()) {
            if (!tempStore.isEmpty() && tempStore.peek() == element) {
                tempStore.pop();
            } else tempStore.push(element);
        }
        for (int i = 0; i < tempStore.size(); i++) {
            output.append(tempStore.get(i));
        }
        return output.toString();
    }
}
