package Arrays;

import java.util.Arrays;

/*
268. Missing Number
Leetcode Link: https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int checkingNumber = nums[0];
        int missingNumber = -1;

        if (nums[len - 1] != len) return len;
        if (nums[0] != 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != checkingNumber) {
                missingNumber = checkingNumber;
                break;
            }
            checkingNumber++;
        }
        return missingNumber;
    }
}

