package Arrays;

/*
1848. Minimum Distance to the Target Element
Leetcode Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/
 */
public class GetMinDistance {
    public int getMinDistance(int[] nums, int target, int start) {
        int found = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                found = Math.min(found, Math.abs(i - start));
            }
        }
        return found;
    }
}
