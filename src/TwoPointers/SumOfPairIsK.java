package TwoPointers;

import java.util.ArrayList;

public class SumOfPairIsK {
    public static void main(String[] args) {
        int input[] = {3, 4, 7, 8, 23, 4};
        int n = input.length;
        int sum = 30;
        isSumK(input, n, sum);
//        isSumK2(input, n, sum);
        isSumK3(input, n, sum);

    }

    //Time complexity = n^2
    static boolean isSumK(int[] arr, int n, int sum) {
        int left = 0;
        int right = 1;
        while (left < right) {
            if (right == n) {
                left++;
                right = left + 1;
            }
            if (arr[left] + arr[right] == sum) {
                System.out.println((left) + " and " + (right));
                return true;
            }

            right++;
        }
        return false;
    }

    //Time complexity = n^2 coz of thr searching
    static boolean isSumK2(int[] arr, int n, int reqSum) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int reqNum = reqSum - arr[i];

            if (temp.contains(reqNum)) {
                return true;
            }
            temp.add(arr[i]);
        }
        return false;
    }

    //Best solution O(n)
    static boolean isSumK3(int[] arr, int n, int reqSum) {
// Initialize an array to store whether an element is encountered or not
        int temp[] = new int[1000000];

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Calculate the complement needed to achieve the required sum
            int complement = reqSum - arr[i];

            // If the complement is found in the 'temp' array, return true
            if (temp[complement] == 1) {
                return true;
            }

            // Mark the current element as encountered by setting its value to 1
            temp[arr[i]] = 1;
        }
        return false;
    }

}
