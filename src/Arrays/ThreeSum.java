package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] input = {-1,0,1,2,-1,-4};
        threeSum(input);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the input array in ascending order.
        List<List<Integer>> output = new ArrayList<>(); // Create a list to store the output triplets.

        if (nums.length < 3) {
            return output; // If the length of the array is less than 3, return an empty list (no triplets possible).
        }

        //Fot the below logic keep in mind that we have sorted the input array.
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                break; // If the current element is greater than 0, break the loop (since there can't be a triplet with a positive first element).
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements to avoid duplicate triplets.
            }

            int low = i + 1, high = nums.length - 1; // Set two pointers, low and high, for the remaining part of the array.
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high]; // Calculate the sum of the triplet.

                if (sum > 0) {
                    high--; // If the sum is greater than 0, decrement the high pointer.
                } else if (sum < 0) {
                    low++; // If the sum is less than 0, increment the low pointer.
                } else {
                    // If the sum is 0, add the triplet to the output list.
                    output.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // Update the pointers to skip duplicate elements.
                    int lastLowOccurrence = nums[low]; // Store the current value of the low pointer.
                    int lastHighOccurrence = nums[high]; // Store the current value of the high pointer.

                    // Move the low pointer to the right to skip duplicate occurrences of the current value.
                    while (low < high && nums[low] == lastLowOccurrence) {
                        low++;
                    }
                    // Move the high pointer to the left to skip duplicate occurrences of the current value.
                    while (low < high && nums[high] == lastHighOccurrence) {
                        high--;
                    }
                }
            }
        }
        return output; // Return the list of unique triplets that sum to zero.
    }
}
