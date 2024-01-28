package Arrays;

/*
80. Remove Duplicates from Sorted Array II
Leetcode Link:https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int indx = 2;
        int length = nums.length;
        if (length < 3) {
            return length;
        }
        for (int i = 2; i < length; i++) {
            if (nums[i] != nums[indx - 2]) {
                nums[indx] = nums[i];
                indx++;
            }
        }
        return indx;
    }
}
