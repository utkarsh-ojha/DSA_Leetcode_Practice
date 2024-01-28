package Arrays;

/*
283. Move Zeroes
Leetcode Link: https://leetcode.com/problems/move-zeroes/description/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int j = 0;
        if (len == 1) {
            return;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < len) {
            nums[j] = 0;
            j++;
        }
    }
}

