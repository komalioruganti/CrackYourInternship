//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxProfit = Math.max(maxPro,prices[i]-min);
        }
   return maxProfit;
    }
}