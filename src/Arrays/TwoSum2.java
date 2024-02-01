package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] input = {1, 4, 5, 6, 7, 9, 11};
        int target = 8;
        twoSum(input, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] output = new int[2];
        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else j--;
        }
        output[0] = i + 1;
        output[1] = j + 1;
        return output;
    }
}
