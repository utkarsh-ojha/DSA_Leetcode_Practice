package DayWise.Day19;

/*
Leetcode Link: https://leetcode.com/problems/next-greater-element-i/description/
 */
public class Problem2 {
    public static void main(String[] args) {
        int[] input1 = {4, 1, 2};
        int[] input2 = {1, 3, 4, 2};
        nextGreaterElement(input1, input2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int lenNum1 = nums1.length;
        int lenNum2 = nums2.length;
        int j = 0;
        int[] outputArr = new int[lenNum1];

        for (int i = 0; i < lenNum1; i++) {
            while (nums1[i] != nums2[j] && j < lenNum2 - 1) {
                j++;
            }
            if (nums1[i] == nums2[j]) {
                int max = -1;
                for (int k = j + 1; k < lenNum2; k++) {
                    if (nums2[k] > max && nums2[k] > nums1[i]) {
                        max = nums2[k];
                        break;
                    }
                }
                j = 0;
                outputArr[i] = max;
            }
        }
        return outputArr;
    }
}
