package SlidingWindow;

/*
Leetcode Link: https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 */
import java.util.ArrayList;
import java.util.Collections;

public class FindUnsortedArray {

    public static void main(String[] args) {
        int[] input = {1, 3, 2, 3, 3};
        findUnsortedSubarray(input);
    }

//    public static int findUnsortedSubarray(int[] nums) {
//        int left = 0;
//        int firstUnsortedIndex = 0;
//        int lastUnsortedIndex = 0;
//        int currentUnSrtedCount = 0;
//        int right = left + 1;
//        if (nums.length == 1) return 0;
//        while (left < right & right < nums.length) {
//            if (nums[left] == nums[right] && firstUnsortedIndex > 0 || nums[left] > nums[right]) {
//                if (currentUnSrtedCount != 0 && nums[firstUnsortedIndex - 1] == nums[right]) right++;
//                else if (currentUnSrtedCount == 0) {
//                    firstUnsortedIndex = left + 1;
//                    currentUnSrtedCount++;
//                } else {
//                    lastUnsortedIndex = right + 1;
//                    currentUnSrtedCount++;
//                }
//                left++;
//                right++;
//            } else {
//                left++;
//                right++;
//            }
//        }
//        if (lastUnsortedIndex < firstUnsortedIndex) return 2;
//        else if (lastUnsortedIndex - firstUnsortedIndex == 0) return 0;
//        else return lastUnsortedIndex - firstUnsortedIndex + 1;
//    }

    public static int findUnsortedSubarray(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int element : nums) temp.add(element);
        Collections.sort(temp);
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp.get(i)) {
                if (first == -1) {
                    first = i;
                } else last = i;
            }
        }
        return last > 0 ? last - first + 1 : 0;
    }
}
