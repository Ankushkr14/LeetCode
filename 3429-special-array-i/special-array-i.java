class Solution {
    public boolean isArraySpecial(int[] nums) {
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if((nums[i] % 2) == (nums[i + 1] % 2))
                return false;
        }
        return true;
    }
}