package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
1380. Lucky Numbers in a Matrix
Leetcode Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
 */
public class LuckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minRowElement = matrix[i][0];
            int ind = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (minRowElement > matrix[i][j]) {
                    minRowElement = matrix[i][j];
                    ind = j;
                }
            }
            int maxColElement = minRowElement;
            Boolean flag = false;
            for (int k = 0; k < matrix.length; k++) {
                if (maxColElement < matrix[k][ind]) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            else {
                list.add(maxColElement);
            }
        }
        return list;
    }
}
