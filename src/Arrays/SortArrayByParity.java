package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        int currentI = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0) {
                output[currentI] = nums[i];
                currentI++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 != 0) {
                output[currentI] = nums[i];
                currentI++;
            }
        }
        return output;
    }

}
