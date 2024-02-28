package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 3,2, 1, 6, 78, 9, 8, 2};
        int j = 1;
        int i = 0;
        while (i < j && j < arr.length) {
            for (i = 0; i < j; i++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            for (int ele : arr) {
                System.out.print(ele + ", ");
            }
            System.out.println();
            j++;
        }
        for (int ele : arr) {
            System.out.print(ele + ", ");
        }
    }
}
