package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
54. Spiral Matrix
Leetcode Link: https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] inputMatrix) {
        List<Integer> outputMatrix = new ArrayList<>();
        int m = inputMatrix.length;
        int n = inputMatrix[0].length;
        int iMax = m - 1;
        int iMin = 0;
        int jMax = n - 1;
        int jMin = 0;

        while (iMin <= iMax || jMin <= jMax) {
            //Step-1
            int j = jMin;
            while (j <= jMax && outputMatrix.size() < m * n) {
                outputMatrix.add(inputMatrix[iMin][j]);
                j++;
            }
            iMin++;
            //Step-2
            int i = iMin;
            while (i <= iMax && outputMatrix.size() < m * n) {
                if (i < iMin) {
                    i++;
                } else {
                    outputMatrix.add(inputMatrix[i][jMax]);
                    i++;
                }
            }
            jMax--;

            //Step-3
            int k = jMax;
            while (k >= jMin && outputMatrix.size() < m * n) {
                outputMatrix.add(inputMatrix[iMax][k]);
                k--;
            }
            System.out.println();
            iMax--;

            //Step-4
            int l = iMax;
            while (l >= iMin && outputMatrix.size() < m * n) {
                outputMatrix.add(inputMatrix[l][jMin]);
                l--;
            }
            jMin++;
        }
        return outputMatrix;
    }
}
