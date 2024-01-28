package Arrays;

/*
1480. Running Sum of 1d Array
Leetcode Link: https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int outputArray[] = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + nums[i];
            outputArray[i] = sum;
        }
        return outputArray;
    }
}
