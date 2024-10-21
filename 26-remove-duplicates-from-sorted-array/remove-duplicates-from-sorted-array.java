class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[first]!=nums[i]){
                first++;
                nums[first] = nums[i];
            }
        }
        return first+1;
    }
}