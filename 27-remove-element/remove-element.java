class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right) {
            if(nums[left] == val) {
                swap(nums, left, right);
                right--;                
            }
            else {
                left++;
            }            
        }
        return left;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}