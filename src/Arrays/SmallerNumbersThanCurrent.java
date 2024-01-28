package Arrays;

/*
1365. How Many Numbers Are Smaller Than the Current Number
Leetcode Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] outputArray = new int[nums.length];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    if (nums[j] < nums[i]) {
                        count++;
                    }
                }
            }
            outputArray[i] = count;
        }
        return outputArray;
    }
}
