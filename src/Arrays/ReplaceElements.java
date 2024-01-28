package Arrays;

import java.util.ArrayList;

/*
1299. Replace Elements with Greatest Element on Right Side
Leetcode Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
 */
public class ReplaceElements {
    //Solution -1
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[i] = max;
            max = Math.max(arr[i], max);
        }
        return output;

    }

    //Solution-2
    class Solution {
        public int[] replaceElements(int[] arr) {
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
    }
}
