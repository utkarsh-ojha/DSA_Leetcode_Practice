package Arrays;

/*
1909. Remove One Element to Make the Array Strictly Increasing
Leetcode Link: https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
 */
public class CanBeIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int counter = 0;
        int current = 1;
        for (int i = current; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (counter > 0) {
                    return false;
                }
                counter++;
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
