class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if(n<3){
            return 0;
        }
        long sum = 0;
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                for(int k = 0;k<n;k++){
                    if(i<j && j<k){
                        long count = (long)(nums[i]-nums[j])*nums[k];
                        sum = Math.max(count, sum);
                    }
                }
            }
        }
        return sum;
    }
}