package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        boolean output = false;
        if (s.length() != goal.length()) {
            return false;
        } else if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char element : s.toCharArray()) {
                if (temp.contains(element)) return true;
                temp.add(element);
            }
            return false;
        } else {
            List<Integer> diffIndices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    diffIndices.add(i);
                }
            }
            return diffIndices.size() == 2 && s.charAt(diffIndices.get(0)) == goal.charAt(diffIndices.get(1)) && s.charAt(diffIndices.get(1)) == goal.charAt(diffIndices.get(0));
        }
    }
}
