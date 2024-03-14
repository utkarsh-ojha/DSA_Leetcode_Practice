package Sorting;

public class GetSumAbsoluteDifferences {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] output = new int[nums.length];
        int[] tempOutput = new int[nums.length];
        int diffAbsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                diffAbsSum += Math.abs(nums[i] - nums[j]);
            }
            output[i] = diffAbsSum;
            diffAbsSum = 0;
        }
        return output;
    }
}
