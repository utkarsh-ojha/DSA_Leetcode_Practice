package DayWise.Day14;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        int input[][] = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> result1 = luckyNumbers(input);
    }


    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
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
            Boolean isNotLucky = false;
            for (int k = 0; k < matrix.length; k++) {
                if (maxColElement < matrix[k][ind]) {
                    isNotLucky = true;
                    break;
                }
            }
            if (isNotLucky)
                continue;
            else {
                list.add(maxColElement);
            }
        }
        return list;
    }
}
