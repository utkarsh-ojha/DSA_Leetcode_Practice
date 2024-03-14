package Sorting;

/*
There are 𝑛
 sticks with some lengths. Your task is to modify the sticks so that each stick has the same length.

You can either lengthen and shorten each stick. Both operations cost 𝑥
 where 𝑥
 is the difference between the new and original length.

What is the minimum total cost?

Input
The first input line contains an integer 𝑛
: the number of sticks.

Then there are n integers: 𝑝1,𝑝2,…,𝑝𝑛
: the lengths of the sticks.

Constraints:

1≤𝑛≤2⋅105
1≤𝑝𝑖≤109
Output
Print one integer: the minimum total cost.
 */
public class StickLength {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 7, 8, 4};
        int r = 5;
        System.out.println(stickCost(input, r));
    }

    static int stickCost(int[] lengths, int toBeLength) {
//        int cost = 0;
//        for (int i = 0; i < lengths.length; i++) {
//            cost += Math.abs(toBeLength - lengths[i]);
//        }
//        return cost;

        int median = 0;
        int n = lengths.length;
        if (n % 2 == 0) {
            median = (lengths[n / 2] + lengths[n / 2 - 1]) / 2; // If even number of sticks, average of middle two lengths
        } else {
            median = lengths[n / 2]; // If odd number of sticks, middle length
        }
        // Calculate the total cost
        int totalCost = 0;
        for (int length : lengths) {
            totalCost += Math.abs(length - median); // Absolute difference between each stick's length and median
        }
        return totalCost;
    }
}
