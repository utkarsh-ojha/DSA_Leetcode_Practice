package DayWise.Day13;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Problem1 {
    class Solution {

        public int maxProfit(int[] prices) {
            int len = prices.length;
            int min = prices[0];
            int minAtElement = 0;
            int maxAtElement = 0;

            for (int i = 1; i < len; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                    minAtElement = i;
                }
            }

            int max = prices[minAtElement];

            for (int j = minAtElement; j < len; j++) {
                if (prices[j] > max) {
                    max = prices[j];
                    maxAtElement = j;
                }
            }
            if(minAtElement < maxAtElement)
                return prices[maxAtElement] - prices[minAtElement];
            else return 0;
        }
    }

}
