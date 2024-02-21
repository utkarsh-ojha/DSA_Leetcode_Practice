package SlidingWindow;
/*
Leetcode link: https://leetcode.com/problems/range-sum-query-immutable/description/
 */
public class RangeSum {
    public static int[] sum;

    public static void main(String[] args) {
        int[] input = {-2, 0, 3, -5, 2, -1};
        RangeSum(input);
        RangeSum.sumRange(2, 5);
    }

    public static void RangeSum(int[] nums) {
        //Length is i+1 is to handel corner.
        sum = new int[nums.length + 1];
        sum[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }
    }

    public static int sumRange(int left, int right) {
        return sum[right - 1] - sum[left];
    }

    /*
    Other solution is ::
    ArrayList<Integer> num = new ArrayList<>();

    public NumArray(int[] nums) {
        for (int i : nums) num.add(i);
    }

    public int sumRange(int left, int right) {
        int i = left;
        int sum = 0;
        while (i <= right) {
            sum += num.get(i);
            i++;
        }
        return sum;
    }
     */
}
