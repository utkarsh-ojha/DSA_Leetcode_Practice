package Arrays;

/*
35. Search Insert Position
Leetcode Link: https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                position = i;
                return position;
            } else if (i == nums.length - 1) {
                position = i + 1;
                return position;
            }
        }
        return position;
    }
}

