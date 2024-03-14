package Searching;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
        // return searchTarget(nums, target, 0, nums.length - 1);
    }
    // int searchTarget(int[] nums, int target, int left, int right) {
    //     if (left > right) return -1;
    //     int mid = left + (right - left) / 2;
    //     if (target == nums[mid]) {
    //         return mid;
    //     } else if (target > nums[mid]) {
    //         left = mid + 1;
    //         return searchTarget(nums, target, left, right);
    //     } else{
    //         right = mid - 1;
    //         return searchTarget(nums, target, left, right);
    //     }
    // }
}
