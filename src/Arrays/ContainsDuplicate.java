package Arrays;

import java.util.Arrays;

/*
217. Contains Duplicate
Leetcode Link: https://leetcode.com/problems/contains-duplicate/description/
*/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

