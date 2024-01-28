package DayWise.Day6;

/*

Leetcode link: https://leetcode.com/problems/running-sum-of-1d-array/description/
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:

        1 <= nums.length <= 1000
        -10^6 <= nums[i] <= 10^6

 */

public class Problem1 {
    public static void main(String[] args) {
        int[] input = {4, 6, 7, 9, 3, 4, 6, 5, 3};
        int[] output = runningSum(input);

    }

    public static int[] runningSum(int[] nums) {
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
