class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        int maxDiff = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<maxDiff){
                maxDiff = nums[i];
            }
            else if(maxDiff< nums[i])
            {
                int diff = nums[i] - maxDiff;
                max = Math.max(max,diff);
            
            }
        }
        if(max > 0 )
            return max;
        else
            return -1;
    }
}