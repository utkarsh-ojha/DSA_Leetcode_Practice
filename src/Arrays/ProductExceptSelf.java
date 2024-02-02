package Arrays;
/*
leetcode link : https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] output = new int[input.length];
        output = productExceptSelf(input);
    }

    public static int[] productExceptSelf(int[] nums) {
//        int product = 1;
//        int[] output = new int[nums.length];
//        int counter = 0;
//        int j = 0;
//        int i = 0;
//        while (j < nums.length) {
//            if (i == counter) {
//                i++;
//            } else if (i < nums.length) {
//                product = product * nums[i];
//                i++;
//                output[counter] = product;
//            } else if (i == nums.length && j <= nums.length - 1) {
//                j++;
//                i = 0;
//                counter++;
//                product = 1;
//            }
//            if (counter == nums.length) break;
//        }
//        return output;

        int product = 1;
        int[] outputBefore = new int[nums.length];
        int[] outputAfter = new int[nums.length];

        outputBefore[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            outputBefore[i] = nums[i - 1] * outputBefore[i - 1];
        }
        int after = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            outputBefore[i] = outputBefore[i] * after;
            after = after * nums[i];
        }
        return outputBefore;
    }
}
