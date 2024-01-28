package DayWise.Day18;

import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        int[] input = {3, 2, 1};
        thirdMax(input);
    }

    public static int thirdMax(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> outputArr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (!outputArr.contains(nums[i])) {
                outputArr.add(nums[i]);
            }
        }
        return outputArr.get(2);
    }
}
