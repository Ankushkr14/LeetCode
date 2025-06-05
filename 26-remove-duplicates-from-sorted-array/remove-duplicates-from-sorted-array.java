class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 1;
        int n = nums.length;
        while(i<n){
            if(nums[i] != nums[j]){
                j++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }else{
                i++;
            }
        }
        return j+1;
    }
}