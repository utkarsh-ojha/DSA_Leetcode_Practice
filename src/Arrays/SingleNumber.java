package Arrays;

import java.util.ArrayList;

/*
136. Single Number
LeetCode Link: https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int output = 0;
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            newList.add(nums[i]);
        }
        while (!newList.isEmpty()) {
            int toRemoveElement = newList.get(0);
            newList.remove(0);

            if (newList.contains(toRemoveElement)) {
                newList.remove(newList.indexOf(toRemoveElement));
                continue;
            } else {
                output = toRemoveElement;
                return output;
            }
        }
        return output;
    }
}

