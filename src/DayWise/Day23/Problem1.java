package DayWise.Day23;

public class Problem1 {
    public static void main(String[] args) {
        int[] input = {0, 0, 1};
        moveZeroes(input);
    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            if (nums[i] == 0 && len > 1) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[len - 1] = 0;
            } else i++;

        }
    }
}

