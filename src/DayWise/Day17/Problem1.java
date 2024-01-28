package DayWise.Day17;

import java.util.ArrayList;

public class Problem1 {

    public static void main(String[] args) {
        int input[] = {17, 18, 5, 4, 6, 1};
        int[] result = replaceElements(input);

    }

    //Solution-1
    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        ArrayList<Integer> outputList = new ArrayList<>();
        int output[] = new int[len];
        int i = 0, j = i + 1;
        int max = 0;
        while (i >= 0 && i < len) {
            if (j < arr.length) {
                if (arr[j] > max) {
                    max = arr[j];
                }
                j++;
            } else {
                if (i == len - 1) {
                    arr[i] = -1;
                    outputList.add(-1);
                    break;
                }
                outputList.add(max);
                arr[i] = max;
                max = 0;
                ++i;
                j = i + 1;
            }
        }

        for (int k = 0; k < len; k++) {
            output[k] = outputList.get(k);
        }
        return output;
    }

    //Solution-2
    public int[] replaceElements1(int[] arr) {

        return arr;
    }


}
