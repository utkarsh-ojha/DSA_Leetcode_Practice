package Arrays;

/*
1470. Shuffle the Array
Leetcode Link: https://leetcode.com/problems/shuffle-the-array/description/
 */
public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] outputArray = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                outputArray[i] = nums[i / 2];
            } else outputArray[i] = nums[n + i / 2];
        }
        return outputArray;
    }
}
