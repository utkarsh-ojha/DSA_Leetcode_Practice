package Arrays;

/*
27. Remove Element
Leetcode Link: https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[counter];
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
                nums[i] = temp;
            }
        }
        return counter;
    }
}

