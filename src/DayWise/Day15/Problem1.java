package DayWise.Day15;

import java.util.ArrayList;

public class Problem1 {

    public static void main(String[] args) {
        int[] input = {2, 2, 1};
        int output = singleNumber(input);
    }

    public static int singleNumber(int[] nums) {
        int output = 0;
        ArrayList<Integer> newList = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            newList.add(nums[i]);
        }
        while (!newList.isEmpty()) {
            int toRemoveElement = newList.get(0);
            newList.remove(0);

            if (newList.contains(toRemoveElement)) {
                newList.remove(newList.indexOf(toRemoveElement));
                continue;
            } else {
                output = toRemoveElement;
                return output;
            }
        }
        return output;
    }

}
