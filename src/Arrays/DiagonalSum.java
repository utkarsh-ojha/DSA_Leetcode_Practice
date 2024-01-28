package Arrays;

/*
1572. Matrix Diagonal Sum
Leetcode Link: https://leetcode.com/problems/matrix-diagonal-sum/
 */
public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                    mat[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i + j == len - 1) {
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
}

