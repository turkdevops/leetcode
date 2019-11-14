package leetcode.problems;

public class P122 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        else {
            int profit = 0;

            boolean stepBuy = true;

            int buy = Integer.MAX_VALUE;
            int sell = Integer.MIN_VALUE;

            for (int price: prices) {
                if (stepBuy) {
                    if (price > buy) {
                        stepBuy = false;
                        sell = price;
                    }
                    else {
                        buy = price;
                    }
                }
                else {
                    if (price < sell) {
                        profit += sell - buy;
                        stepBuy = true;
                        buy = price;
                    }
                    else {
                        sell = price;
                    }
                }
            }

            return profit + (stepBuy ? 0 : (sell - buy));
        }
    }
}
