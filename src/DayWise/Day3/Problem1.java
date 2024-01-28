package DayWise.Day3;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//        Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
//
//
//Constraints:
//
//        1 <= nums.length <= 105
//        -231 <= nums[i] <= 231 - 1
//        0 <= k <= 105
//
//
//Follow up:
//
//Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
//Could you do it in-place with O(1) extra space?
public class Problem1 {
    public void rotate(int[] nums, int k) {
        // It is not needed to rotate if you end up at same place.
        // Hence eliminating 360 degree rotating with remainder
        if(nums.length < k){
            k = k % nums.length;
        }

        // Find the ending suffix part
        // This needs to be copied and pasted into the beginning later
        int[] suffix = new int[k];
        for(int m = 0; m<k; m++){
            suffix[k-m-1] = nums[nums.length - m -1];
        }

        // Shift the beginning to the end in reverse fashion
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Paste the copied ending part to the beginning.
        for(int m = 0; m<k; m++){
            nums[m] = suffix[m];
        }
    }


}
