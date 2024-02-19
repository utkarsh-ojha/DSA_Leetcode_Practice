package SlidingWindow;

/*
Leetcode Link: https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 */
public class MaximumDifference {
    public int maximumDifference(int[] nums) {
        int result = Integer.MIN_VALUE;
        int min = nums[0];
        if (nums.length < 2) return -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                result = Math.max(result, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }
        if (result > Integer.MIN_VALUE) return result;
        else return -1;
    }
}
