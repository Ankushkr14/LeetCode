class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(nums[left]== val){
                
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;

            }
            else
                left++;

        }
        return left;
        
    }
}