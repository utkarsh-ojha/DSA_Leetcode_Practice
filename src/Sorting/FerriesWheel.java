package Sorting;

import java.util.Arrays;

/*
There are n children who want to go to a Ferris wheel, and your task is to find a gondola for each child.
Each gondola may have one or two children in it, and in addition, the total weight in a gondola may not exceed x. You know the weight of every child.
What is the minimum number of gondolas needed for the children?
Input
The first input line contains two integers n and x: the number of children and the maximum allowed weight.
The next line contains n integers p_1,p_2,\ldots,p_n: the weight of each child.
Output
Print one integer: the minimum number of gondolas.
Constraints

1 \le n \le 2 \cdot 10^5
1 \le x \le 10^9
1 \le p_i \le x

Example
Input:
4 10
7 2 3 9

Output:
3
 */
public class FerriesWheel {
    public static void main(String[] args) {
        int[] input = {3, 4, 6, 2, 5, 1};
        int n = 6;
        int r = 10;
        System.out.println(calculateChild(n, input, r));
    }

    static int calculateChild(int numberOfChildren, int[] childWight, int maxWeight) {
        Arrays.sort(childWight);
        int i = 0;
        int j = numberOfChildren - 1;
        int gondolasCount = 0;
        while (i <= j) {
            if (childWight[i] + childWight[j] <= maxWeight) {
                gondolasCount++;
                i++;
                j--;
            } else if (childWight[i] + childWight[j] > maxWeight) {
                j--;
                gondolasCount++;
            }
        }
        return gondolasCount;
    }
}
