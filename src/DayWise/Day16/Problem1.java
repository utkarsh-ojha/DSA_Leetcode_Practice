package DayWise.Day16;

/*
Leetcode Link: https://leetcode.com/problems/intersection-of-two-arrays/
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem1 {

    public static void main(String[] args) {
        int input1[] = {2, 1};
        int input2[] = {1, 1};
        int output[] = intersection(input1, input2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int lenNums1 = nums1.length;
        int lenNums2 = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        Set<Integer> output = new HashSet<>();

        while (i < lenNums1 && j < lenNums2) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                output.add(nums1[i]);
                i++;
                j++;
            }
        }

        int out[] = new int[output.size()];
        int k = 0;
        for (Integer element : output) {
            out[k++] = element;
        }
        return out;
    }
}
