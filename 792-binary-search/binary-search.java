class Solution {
    private int binary(int[] nums, int low, int high , int target){
        if(low>high){
            return -1;
        }
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }else{
                if(target> nums[mid]){
                    return binary(nums,mid+1, high, target);
                }else{
                    return binary(nums,low,mid-1, target);
                }
            }
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binary(nums,0,n-1,target);
    }
}