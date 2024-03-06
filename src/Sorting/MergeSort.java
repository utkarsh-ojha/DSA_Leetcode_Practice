package Sorting;
/*
Leetcode Link: https://leetcode.com/problems/sort-an-array/description/
 */
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {3, 11, 5, 9, 14, 1, 6};
        int[] output = mergeSort(input);
        for (int element : output) {
            System.out.print(element + ", ");
        }

    }

    static int[] mergeSort(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums;
        int[] left = Arrays.copyOfRange(nums, 0, len / 2);
        int[] right = Arrays.copyOfRange(nums, len / 2, len);
        left = mergeSort(left);
        right = mergeSort(right);

        return mergeSortedArrays(left, right);
    }

    static int[] mergeSortedArrays(int[] left, int[] right) {
        int[] output = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                output[k] = left[i];
                i++;
            } else {
                output[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            output[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            output[k] = right[j];
            k++;
            j++;
        }

        return output;
    }
}
