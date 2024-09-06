class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for(int i = goal -1; i>=0 ;i--){
            int curr = i+nums[i];
            if(curr >= goal){
                goal = i;
            }
        }
        if(goal == 0){
            return true;
        }
        return false;
    }
}