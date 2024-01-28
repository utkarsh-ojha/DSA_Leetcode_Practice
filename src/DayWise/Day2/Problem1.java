package DayWise.Day2;

/*
Leetcode Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

Problem :: Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each
           unique element appears at most twice. The relative order of the elements should be kept the same.

           Since it is impossible to change the length of the array in some languages, you must instead have the
           result be placed in the first part of the array nums. More formally, if there are k elements after
           removing the duplicates, then the first k elements of nums should hold the final result.
           It does not matter what you leave beyond the first k elements.

           Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

@Author : utkarsh-ojha
 */
public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 5}; // Input array

        int k = removeDuplicates(nums); // Calls your implementation


    }

    public static int removeDuplicates(int[] nums) {
        int indx = 2;
        int length = nums.length;

        if (length < 3) {
            return length;
        }
        for (int i = 2; i < length; i++) {
            if (nums[i] != nums[indx - 2]) {
                nums[indx] = nums[i];
                indx++;
            }
        }
        for (int j = 0; j < length; j++) {
            System.out.print(nums[j] + ", ");
        }
        return indx;
    }
}
