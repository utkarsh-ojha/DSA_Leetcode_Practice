package DayWise.Day19;

/*
Leetcode link:
 */
public class Problem4 {

    public int maxProductDifference(int[] nums) {
        int first_max = 0;
        int second_max = 0;
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first_max) {
                second_max = first_max;
                first_max = nums[i];
            } else if (nums[i] > second_max) {
                second_max = nums[i];
            }

            if (nums[i] < first_min) {
                second_min = first_min;
                first_min = nums[i];
            } else if (nums[i] < second_min) {
                second_min = nums[i];
            }
        }

        return (first_max * second_max) - (first_min * second_min);
    }

}
