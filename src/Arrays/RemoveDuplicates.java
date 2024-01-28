package Arrays;

/*
26. Remove Duplicates from Sorted Array
Leetcode Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int lengthOfArray = nums.length;
        int current = 0;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (nums[current] == nums[current + 1]) {
                for (int k = current + 1; k < lengthOfArray - 1; k++) {
                    nums[k] = nums[k + 1];
                }
                nums[lengthOfArray - 1] = nums[current];
            } else if (nums[current] < nums[current + 1]) {
                current++;
            } else if (nums[current] > nums[current + 1]) {
                return current + 1;
            }
        }
        return current + 1;
    }
}

