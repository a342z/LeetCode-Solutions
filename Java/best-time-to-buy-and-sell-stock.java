class Solution {
    public int maxProfit(int[] prices) {
        int profit= 0 ;
        int l=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]-prices[l] > profit )
                profit = prices[i]-prices[l] ;
            if(prices[i]<prices[l]) 
                l = i ;
        }
        return profit;
    }
}