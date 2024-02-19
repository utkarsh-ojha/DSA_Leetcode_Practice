package SlidingWindow;
/*
Leetcode Link: https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
