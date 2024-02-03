package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
 */
import java.util.Arrays;

public class MinPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int currentSum = nums[i] + nums[j];
            maxSum = maxSum < currentSum ? currentSum : maxSum;
            i++;
            j--;
        }
        return maxSum;
    }
}
