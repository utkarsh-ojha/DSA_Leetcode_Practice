package Arrays;

import java.util.ArrayList;

/*
1389. Create Target Array in the Given Order
Leetcode Link: https://leetcode.com/problems/create-target-array-in-the-given-order/description/
 */
public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
