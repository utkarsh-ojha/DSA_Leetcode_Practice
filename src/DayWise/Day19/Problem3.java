package DayWise.Day19;

public class Problem3 {
    public static void main(String[] args) {
        int[] input = {1, 2, 10, 5, 7};
        canBeIncreasing(input);
    }

    public static boolean canBeIncreasing(int[] nums) {
        int counter = 0;
        int current = 1;
        for (int i = current; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (counter > 0) {
                    return false;
                }
                counter++;
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
