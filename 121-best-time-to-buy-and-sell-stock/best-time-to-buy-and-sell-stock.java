class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                if(prices[i] > minPrice){
                    int diff = prices[i] - minPrice;
                    maxPro = Math.max(maxPro, diff);
                }
            }
        }
        return maxPro;
    }
}