package Arrays;

/*
414. Third Maximum Number
Leetcode Link: https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer i : nums) {
            if (nums.length >= 3) {
                if (i.equals(firstMax) || i.equals(secondMax) || i.equals(thirdMax)) {
                    continue;
                }
                if (firstMax == null || i > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = i;
                } else if (secondMax == null || i > secondMax) {
                    thirdMax = secondMax;
                    secondMax = i;
                } else if (thirdMax == null || i > thirdMax) {
                    thirdMax = i;
                }
            } else {
                if (firstMax == null || i > firstMax) {
                    firstMax = i;
                }
            }
        }
        return nums.length >= 3 ? (thirdMax != null ? thirdMax : firstMax) : firstMax;
    }
}
