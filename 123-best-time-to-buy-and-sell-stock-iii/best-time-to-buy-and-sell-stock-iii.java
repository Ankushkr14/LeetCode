class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0)
            return 0;
        int[] left = new int[n];
        int[] right = new int[n];

        //For left array to store values from left side
        int minLeft = prices[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],prices[i] - minLeft);
            minLeft = Math.min(minLeft,prices[i]);
        }

        //For right array to store values from right which we can say max to min ( selling value to buying value)
        int maxRight = prices[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],maxRight - prices[i]);
            maxRight = Math.max(maxRight, prices[i]);
        }

        int profit = right[0];
        for(int i=1;i<n;i++){
            profit = Math.max(profit,left[i-1]+right[i]);
        }

        return profit;


    }
}