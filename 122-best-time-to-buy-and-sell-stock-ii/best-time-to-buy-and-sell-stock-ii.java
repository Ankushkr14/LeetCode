class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxPro = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrices)
                minPrices= prices[i];
            else if(prices[i]>minPrices){
                int diff = prices[i]-minPrices;
                maxPro+=diff;
                minPrices=prices[i];
            }
            
        }
        return maxPro;
    }
}