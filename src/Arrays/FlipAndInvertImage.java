package Arrays;

/*
832. Flipping an Image
Leetcode Link: https://leetcode.com/problems/flipping-an-image/
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] newArr = new int[image[0].length][image.length];
        for (int i = 0; i < image[0].length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                newArr[i][image[0].length - 1 - j] = image[i][j];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if (newArr[i][j] == 1) {
                    newArr[i][j] = 0;
                } else if (newArr[i][j] == 0) {
                    newArr[i][j] = 1;
                }
            }
        }
        return newArr;
    }
}

