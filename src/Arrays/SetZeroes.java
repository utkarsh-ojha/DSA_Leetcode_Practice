package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetZeroes {
    public static void main(String[] args) {
//        int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] input = {{0, 1}};
        setZeroes(input);

    }
/*
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
    */

    /*
    //Solution-2
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> tempI = new ArrayList<>();
        ArrayList<Integer> tempJ = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    tempI.add(i);
                    tempJ.add(j);
                }
            }
        }
        //setting column to 0
        for (int i = 0; i < tempI.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[tempI.get(i)][j] = 0;
            }
        }
        //setting row to 0
        for (int i = 0; i < tempJ.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][tempJ.get(i)] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    */

    //Solution -3
    public static void setZeroes(int[][] matrix) {

    }
}
