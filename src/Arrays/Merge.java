package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
88. Merge Sorted Array
Leetcode Link:https://leetcode.com/problems/merge-sorted-array/
*/
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[m + n];
        List<Integer> listOutput = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            listOutput.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            listOutput.add(nums2[j]);
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = listOutput.get(k);
        }
        Arrays.sort(nums1);
    }
}

