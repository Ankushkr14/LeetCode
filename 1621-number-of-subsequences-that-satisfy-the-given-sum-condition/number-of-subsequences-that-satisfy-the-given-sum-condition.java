class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int MOD = 1000000007;

        long[] pow = new long[n];
        for(int i = 0;i<n;i++){
            if(i ==0 ){
                pow[i] = 1;
            }else{
                pow[i] = (pow[i-1]*2)%MOD;
            }
        }
        int l = 0;
        int r = n-1;
        long count = 0;
        while(l<=r){
            int sum = nums[l] + nums[r];
            if(sum <= target){
                count = (count + pow[r-l])%MOD;
                l++;
            }else{
                r--;
            }
        }
        return (int)count;
    }
}