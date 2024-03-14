package Sorting;

import java.util.Arrays;

public class MinDiffOfMaxAndMinInKElement {
    public static void main(String[] args) {
        int[] input = {45, 6, 7, 122, 123, 124, 34, 54, 67};
        int k = 3;
        System.out.println(diff(input, k));
    }

    static int diff(int[] arr, int k) {
        Arrays.sort(arr);
        int min = Math.abs(arr[k - 1] - arr[0]);
        for (int i = 1; i < arr.length - 2; i++) {
            min = Math.min(min, Math.abs(arr[i + k - 1] - arr[i]));
        }
        return min;
    }
}
