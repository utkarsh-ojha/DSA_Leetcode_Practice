package SlidingWindow;

public class NumSubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] input = {10, 5, 2, 6};
        int k = 100;
        numSubarrayProductLessThanK(input, k);
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length == 1) return 0;
        int product = 1;
        int left = 0;
        int right = 0;
        int count = 0;

        while (left < nums.length) {
            product *= nums[right];
            if (product < k) {
                right++;
                count++;
            } else {
                left++;
                right = left;
                product = 1;

            }
            if (right == nums.length) {
                left++;
                right = left;
                product = 1;

            }

        }
        return count;
    }
}
