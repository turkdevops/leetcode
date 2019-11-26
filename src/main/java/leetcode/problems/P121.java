package leetcode.problems;

public class P121 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        // min price and max profit so far
        int[][] dp = new int[prices.length][2];

        dp[0][0] = prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < prices.length; ++i) {
            dp[i][0] = Math.min(dp[i-1][0], prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], prices[i] - dp[i-1][0]);
        }

        return dp[prices.length-1][1];
    }
}