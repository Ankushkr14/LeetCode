class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int index = -1;
        int mid = 0;
        while(low<=high){
            mid=low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target > nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        if(nums[mid]>target){
            return mid;
        }else{
            return mid +1;
        }
    }
}