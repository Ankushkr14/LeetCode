class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProf = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else{
                int diff = prices[i]-buy;
                maxProf = Math.max(maxProf,diff);
            }
        }
        return maxProf;
    }
}