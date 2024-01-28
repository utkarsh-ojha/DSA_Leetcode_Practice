package Arrays;

/*
189. Rotate Array
Leetcode Link: https://leetcode.com/problems/rotate-array/
*/
public class Rotate {
    public void rotate(int[] nums, int k) {
        // It is not needed to rotate if you end up at same place.
        // Hence eliminating 360 degree rotating with remainder
        if (nums.length < k) {
            k = k % nums.length;
        }

        // Find the ending suffix part
        // This needs to be copied and pasted into the beginning later
        int[] suffix = new int[k];
        for (int m = 0; m < k; m++) {
            suffix[k - m - 1] = nums[nums.length - m - 1];
        }

        // Shift the beginning to the end in reverse fashion
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Paste the copied ending part to the beginning.
        for (int m = 0; m < k; m++) {
            nums[m] = suffix[m];
        }
    }
}
