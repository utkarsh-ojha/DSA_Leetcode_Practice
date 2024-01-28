package Arrays;

import java.util.List;

/*
1773. Count Items Matching a Rule
Leetcode Link: https://leetcode.com/problems/count-items-matching-a-rule/
*/
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = (ruleKey.equals("type")) ? 0 : (ruleKey.equals("color")) ? 1 : 2;
        for (List i : items) {
            if (i.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
