package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 33, 4, 78, 9, 0, 12, 4, 5};
        int len = arr.length;
        int counter = 0;
        System.out.println("Initial array looks like : ");
        for (int ele : arr) System.out.print(ele + ", ");
        System.out.println();
        System.out.println("=================");
        while (counter < len - 1) {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for (int ele : arr) System.out.print(ele + ", ");
            System.out.println();

            counter++;
        }

        System.out.println("Final Bubble sorted array is :");
        for (int ele : arr) System.out.print(ele + ", ");

    }
}
