package Searching;

import java.util.ArrayList;

public class RandomBinarySearchOnUnSortedArray {
    public static void main(String[] args) {
        int[] input = {3,4, 56, 55, 9, 21};
        for (int ele: alwaysSearchAbleThroughBinarySearchAlgo(input)){
            System.out.println(ele);
        }
    }

    static ArrayList<Integer> alwaysSearchAbleThroughBinarySearchAlgo(int[] arr) {
        int len = arr.length;
        int[] copyOfArr = new int[len];
        System.arraycopy(arr, 0, copyOfArr, 0, len);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] prefixMax = new int[len];
        int[] suffixMin = new int[len];
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i]);
            prefixMax[i] = max;
        }
        for (int k = len - 1; k >= 0; k--) {
            min = Math.min(min, arr[k]);
            suffixMin[k] = min;
        }

        ArrayList<Integer> output = new ArrayList<>();
        for (int j = 0; j < len; j++) {
            if (arr[j] >= prefixMax[j] && arr[j] <= suffixMin[j]) {
                output.add(arr[j]);
            }
        }

        return output;
    }
}
