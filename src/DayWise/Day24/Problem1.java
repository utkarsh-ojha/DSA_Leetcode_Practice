package DayWise.Day24;

import java.util.Scanner;

/*
Matrix Multiplication
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the size for row of matrix 1");
        int A = sc.nextInt();
        System.out.println("Provide the size for col of matrix 1 and row of matrix 2");
        int B = sc.nextInt();
        System.out.println("Provide the size for col of matrix 2");
        int C = sc.nextInt();

        int[][] matrix1 = new int[A][B];
        int[][] matrix2 = new int[B][C];
        int[][] result = new int[A][C];

        System.out.println("Provide the input for matrix 1");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Provide the input for matrix 2");
        for (int k = 0; k < B; k++) {
            for (int l = 0; l < C; l++) {
                matrix2[k][l] = sc.nextInt();
            }
        }

        System.out.println("The matrix multiplication for Matrix 1 and matrix 2 is :: ");
        for (int m = 0; m < A; m++) {
            for (int n = 0; n < C; n++) {
                int sum = 0;
                for (int o = 0; o < B; o++) {
                    sum += matrix1[m][o] * matrix2[o][n];
                }
                result[m][n] = sum;
            }
        }
        //Printing output
        for (int i = 0; i < A; i++) {
            for (int item : result[i]) {
                System.out.print(item + " ");
            }
            System.out.println();

        }

    }
}
