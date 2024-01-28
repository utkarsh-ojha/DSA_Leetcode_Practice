package DayWise.Day12;

/*
Leetcode Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]


Constraints:

1 <= n <= 1000
 */
public class Problem2 {

    public static void main(String[] args) {
        int res[] = new int[5];
        res = sumZero(4);
    }

    public static int[] sumZero(int n) {
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
