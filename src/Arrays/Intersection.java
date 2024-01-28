package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
349. Intersection of Two Arrays
Leetcode Link: https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
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
