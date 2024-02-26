package Recursion;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] input = {3, 4, 6, 7, 5, 3, 2, 4, 9};
        findElement(input, 5, 0);

    }

    static int findElement(int[] arr, int elementToFind, int counter) {
        if (arr[counter] == elementToFind) return counter;
        if (counter > arr.length - 1) return -1;
        return findElement(arr, elementToFind, counter + 1);
    }
}
