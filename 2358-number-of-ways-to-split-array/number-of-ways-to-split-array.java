class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long[] sum = new long[n];
        sum[0]=nums[0];

        for(int i =1; i<n;i++){
            sum[i] = sum[i-1]+nums[i];
        }

        int count = 0;

        for(int i =0; i<n-1;i++){
            long left =  sum[i];
            long right = sum[n-1]-sum[i];
            if(left>=right){
                count++;
            }
        }
        return count;
    }
}