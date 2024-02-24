package Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] input = {1, 3, 7, 9, 8, 6, 5, 4};
        nextPermutation(input);
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int pointer = nums.length - 2;
        int pivot = -1;
        while (pointer >= 0 && nums[pointer] >= nums[pointer + 1]) {
            pointer--;
        }

        if (pointer >= 0) {
            for (int i = nums.length - 1; i > pointer; i--) {
                if (nums[i] > nums[pointer]) {
                    pivot = i;
                    break;
                }
            }
            int temp = nums[pivot];
            nums[pivot] = nums[pointer];
            nums[pointer] = temp;
        }
        if (pointer < 0) {
            reverse(nums, 0);
        } else {
            reverse(nums, pointer + 1);
        }
    }

    private static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
