package Arrays;

import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
//        int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] input = {{0, 1}};
        setZeroes(input);

    }

    //Solution -1
    public static void setZeroes(int[][] matrix) {
        int[][] tempArray = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tempArray[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < tempArray.length; k++) {
                        for (int l = 0; l < tempArray[0].length; l++) {
                            tempArray[k][j] = 0;
                            tempArray[i][l] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            System.arraycopy(tempArray[i], 0, matrix[i], 0, tempArray[i].length);
        }
        // for (int i = 0; i < tempArray.length; i++) {
        //     for (int j = 0; j < tempArray[i].length; j++) {
        //         System.out.print(tempArray[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}
