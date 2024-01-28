package Arrays;

/*
485. Max Consecutive Ones
Leetcode Link: https://leetcode.com/problems/max-consecutive-ones/
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else if (nums[i] == 0) {
                counter = 0;
            }
        }
        return max;
    }
}
