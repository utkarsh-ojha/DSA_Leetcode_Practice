package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {3, 11, 5, 9, 14, 1, 6};
        int[] output = mergeSort(input, input.length);
        for (int element : output) {
            System.out.print(element + ", ");
        }

    }

    static int[] mergeSort(int[] arr, int len) {

        if (len <= 1) return arr;
        else {
            int leftLength = len / 2;
            int rightLength = len - leftLength;
            int[] left = new int[leftLength];
            int[] right = new int[rightLength];
            System.arraycopy(arr, 0, left, 0, leftLength);
            System.arraycopy(arr, leftLength, right, 0, rightLength);
            mergeSort(left, leftLength);
            mergeSort(right, rightLength);
            return mergeSortedArrays(left, leftLength, right, rightLength);
        }
    }

    static int[] mergeSortedArrays(int[] left, int leftLength, int[] right, int rightLength) {
        int i = 0, j = 0, counter = 0;
        int[] newArr = new int[leftLength + rightLength];

        while (i < leftLength && j < rightLength) {
            if (left[i] < right[j]) {
                newArr[counter++] = left[i++];
            } else {
                newArr[counter++] = right[j++];
            }
        }

        // Copy remaining elements of left array
        while (i < leftLength) {
            newArr[counter++] = left[i++];
        }

        // Copy remaining elements of right array
        while (j < rightLength) {
            newArr[counter++] = right[j++];
        }

        return newArr;
    }
}
