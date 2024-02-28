package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 78, 9, 8, 2};
        int j = 0;
        int i = 0;
        System.out.println("Unsorted array is :: ");
        for (int ele : arr) System.out.print(ele + ", ");
        System.out.println();
        System.out.println("===================");

        while (j < arr.length - 1) {
            int minElementIndex = j;
            i = j;
            while (i < arr.length) {
                if (arr[i] < arr[minElementIndex]) {
                    minElementIndex = i;
                }
                i++;
            }
            System.out.println("Min Element index is : " + minElementIndex);
            int temp = arr[j];
            arr[j] = arr[minElementIndex];
            arr[minElementIndex] = temp;
            j++;
            for (int ele : arr) System.out.print(ele + ", ");
            System.out.println();
        }
        System.out.println("Sorted array using insertion sort is : ");
        for (int ele : arr) System.out.print(ele + ", ");

    }
}
