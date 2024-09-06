class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i =0 ; i< prices.length; i++){
            if(minPrice > prices[i])
                minPrice = prices[i];
            else{
                if(minPrice <= prices[i]){
                    int diff = prices[i] - minPrice;
                    profit+= diff;
                    minPrice = prices[i];
                }
            }
        }
        return profit;
    }
}