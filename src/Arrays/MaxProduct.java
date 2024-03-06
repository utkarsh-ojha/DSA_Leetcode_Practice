package Arrays;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] input = {10, 2, 5, 2};
        System.out.println(maxProduct(input));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] != nums[len - 2]) {
            return (nums[len - 1] - 1) * (nums[len - 2] - 1);
        } else return (nums[len - 1] - 1) * (nums[len - 1] - 1);
    }
}
