package SlidingWindow;

/*
Leetcode Link: https://leetcode.com/problems/max-consecutive-ones-iii/
 */
public class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int zeroCount = 0;
        int i = 0;
        int j = 0;
        int len = nums.length;
        while (i < len && j < len) {
            if (nums[j] == 1) {
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else if (zeroCount < k) {
                zeroCount++;
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else if (nums[i] == 0) {
                zeroCount--;
                i++;
            } else {
                i++;
            }
        }
        return maxLen;
    }
}
