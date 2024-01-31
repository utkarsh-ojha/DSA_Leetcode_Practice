package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/
 */
public class DifferenceOfSum {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
            int tempNum = nums[i];
            int tempSum = 0;
            while (tempNum > 0) {
                tempSum += tempNum % 10;
                tempNum = tempNum / 10;
            }
            digitSum += tempSum;
            tempSum = 0;
        }
        return Math.abs(elementSum - digitSum);
    }

}
