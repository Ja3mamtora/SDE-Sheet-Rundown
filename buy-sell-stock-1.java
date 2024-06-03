class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE, maxProfit = -1;

        for(int i = 0 ; i < prices.length ; i++) {
            mini = Math.min(mini,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-mini);
        }
        return maxProfit;
    }
}