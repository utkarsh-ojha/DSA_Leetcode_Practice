package DayWise.Day24;

/*
Leetcode Link: https://leetcode.com/problems/spiral-matrix/
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
//        System.out.println("Enter the row size of matrix");
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        System.out.println("Enter the column size of matrix");
//        int n = sc.nextInt();
//
//        int inputMatrix[][] = new int[m][n];
//        List<Integer> outputMatrix = new ArrayList<Integer>();
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println("Enter the " + i + ", " + j + " th Element");
//                inputMatrix[i][j] = sc.nextInt();
//            }
//        }

        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> output = spiralOrder(input);

    }

    public static List<Integer> spiralOrder(int[][] inputMatrix) {
        List<Integer> outputMatrix = new ArrayList<Integer>();
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
