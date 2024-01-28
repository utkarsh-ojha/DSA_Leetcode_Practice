package Arrays;

import java.util.Arrays;

/*
1051. Height Checker
Leetcode Link: https://leetcode.com/problems/height-checker/description/
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] newArr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            newArr[i] = heights[i];
        }
        Arrays.sort(newArr);
        int counter = 0;
        for (int j = 0; j < heights.length; j++) {
            if (newArr[j] != heights[j]) counter++;
        }
        return counter;
    }
}
