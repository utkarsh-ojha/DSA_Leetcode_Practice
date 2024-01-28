package DayWise.Day14;

public class Problem2 {
        public boolean findRotation(int[][] mat, int[][] target) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = i; j < mat.length; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < mat.length; i++) {
                int start = 0;
                int end = mat.length - 1;
                while (start < end) {
                    int temp = mat[i][start];
                    mat[i][start] = mat[i][end];
                    mat[i][end] = temp;
                    start++;
                    end--;
                }
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (mat[i][j] == target[i][j])
                        continue;
                    else return false;
                }
            }
            return true;
        }

}
