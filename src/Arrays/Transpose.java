package Arrays;

/*
867. Transpose Matrix
Leetcode Link: https://leetcode.com/problems/transpose-matrix/
 */
public class Transpose {
    public int[][] transpose(int[][] matrix) {
        int outputMat[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                outputMat[i][j] = matrix[j][i];
            }
        }
        return outputMat;
    }
}
