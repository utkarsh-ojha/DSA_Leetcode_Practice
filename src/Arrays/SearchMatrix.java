package Arrays;

public class SearchMatrix {
    public static void main(String[] args) {
        int [][] input = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        searchMatrix(input, 30);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowToFind = 0;
        int rowLen = matrix.length;
        if (rowLen > 1) {
            for (int i = 0; i < matrix.length; i++) {
                if (target <= matrix[i][matrix[i].length-1]) {
                    rowToFind = i;
                    break;
                } else if (target == matrix[i][0]) return true;
            }
        }
        if (rowToFind >= 0) {
            for (int j = 0; j < matrix[rowToFind].length; j++) {
                if (target == matrix[rowToFind][j]) return true;
            }
        }
        return false;
    }
}
