public class leetcode_121 {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int j = 0;
        for (int i=1; i<prices.length; i++) {
            if(prices[j]<prices[i]) {
               int profit = prices[i] - prices[j];
               max_profit = Math.max(profit, max_profit);
            }
            else {
                j = i;
            }
        }
        return max_profit;
    }
}
