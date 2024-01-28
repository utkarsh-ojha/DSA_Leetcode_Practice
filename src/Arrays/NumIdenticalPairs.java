package Arrays;

/*
1512. Number of Good Pairs
Leetcode Link:https://leetcode.com/problems/number-of-good-pairs/
 */
public class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] & i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}