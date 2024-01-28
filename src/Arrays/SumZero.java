package Arrays;

/*
1304. Find N Unique Integers Sum up to Zero
Leetcode Link:https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
*/
public class SumZero {
    public int[] sumZero(int n) {
        int outputArr[] = new int[n];
        if (n % 2 != 0) {
            outputArr[0] = 0;
        }
        for (int i = 0; i < n - 1; i = i + 2) {
            outputArr[i] = i + 1;
            outputArr[i + 1] = -(i + 1);
        }
        return outputArr;
    }
}
