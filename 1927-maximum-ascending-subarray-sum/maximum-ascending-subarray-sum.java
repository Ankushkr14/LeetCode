class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int j = 0;
        int max = 0;
        int sum = nums[0];
        for(int i=1; i<n;i++){
            if(nums[i]<=nums[j]){
                max = Math.max(max,sum);
                j = i;
                sum = nums[i];
            }else{
                j++;
                sum+=nums[i];
            }            
        }
        return Math.max(max,sum);
    }
}