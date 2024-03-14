package Sorting;

import java.util.Arrays;

public class MinAbsoluteDiff {
    public static void main(String[] args) {
        int[] input = {5, 7, 8, 3, 6};
        System.out.println(minAbsDiff(input));
    }

    static int minAbsDiff(int[] arr) {
        Arrays.sort(arr);
        for (int ele : arr) System.out.println(ele);
        int min = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
        }
        return min;
    }
}
