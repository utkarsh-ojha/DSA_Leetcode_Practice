package DayWise.Day12;

public class Problem3 {
    public static void main(String[] args) {
        int input[] = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(input);
    }


    public static int majorityElement(int[] nums) {
        int counter = 1;
        int max = counter;
        int element = 0;
        int currentMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        ++counter;
                        nums[j] = 0;
                        if (counter > max) {
                            max = counter;
                        }
                        if (currentMax < max)
                            element = i;
                    }

                }
            }
            currentMax = max;
            counter = 1;
        }

        if (max >= nums.length / 2) {
            return nums[element];
        }
        return 1;
    }
}
