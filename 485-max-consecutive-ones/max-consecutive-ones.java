class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i] == 1)
                count++;
            else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}