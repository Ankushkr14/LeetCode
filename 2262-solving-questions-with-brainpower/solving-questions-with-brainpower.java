class Solution {
    private long maxSum(int idx, int[][] questions,long[] dp){
        if(idx >= questions.length){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        long take_it = (long)questions[idx][0] + maxSum(idx + questions[idx][1]+1, questions,dp);
        long leave_it = (long)maxSum(idx+1, questions,dp);

        return dp[idx] = Math.max(take_it, leave_it);
    }
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        Arrays.fill(dp,-1);
        long sum = maxSum(0, questions,dp);
        return sum;
    }
}