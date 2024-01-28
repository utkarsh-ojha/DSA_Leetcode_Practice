package Arrays;

/*
1672. Richest Customer Wealth
Leetcode Link: https://leetcode.com/problems/richest-customer-wealth/
 */
public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int len = accounts[0].length;
        int highestWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealthSum = 0;
            for (int j = 0; j < len; j++) {
                wealthSum = wealthSum + accounts[i][j];
            }
            if (wealthSum >= highestWealth) {
                highestWealth = wealthSum;
            }
        }
        return highestWealth;
    }
}
