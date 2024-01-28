package DayWise.Day20;
/*
Leetcode link: https://leetcode.com/problems/height-checker/description/
 */
import java.util.Arrays;

public class Problem1 {
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
