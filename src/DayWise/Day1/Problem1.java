package DayWise.Day1;

/*
Leetcode Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

Problem :: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
           unique element appears only once. The relative order of the elements should be kept the same. Then return
           the number of unique elements in nums.

           Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

           Change the array nums such that the first k elements of nums contain the unique elements in the order they
           were present in nums initially.

           The remaining elements of nums are not important as well as the size of nums.
           Return k.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

@Author : utkarsh-ojha
 */
public class Problem1 {

    public static void main(String[] args) {
        int[] nums = {1, 1,2}; // Input array
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

    }

    public static int removeDuplicates(int[] nums) {
        int lengthOfArray = nums.length;
        int current = 0;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (nums[current] == nums[current + 1]) {
                for (int k = current+ 1; k < lengthOfArray - 1; k++) {
                    nums[k] = nums[k + 1];
                }
                nums[lengthOfArray - 1] = nums[current];
            } else if (nums[current] < nums[current+1]) {
                current++;
            } else if (nums[current] > nums[current + 1]) {
                return current+1;
            }

        }
        return current+1;
    }

}
