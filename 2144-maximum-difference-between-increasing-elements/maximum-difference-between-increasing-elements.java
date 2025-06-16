class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int diff = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }else{
                int a = nums[i]-min;
                diff = Math.max(diff, a);
            }
        }
        return diff<=0?-1:diff;
    }
}