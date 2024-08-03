class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low =1;
        int high = n-2;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1])
            return 0;
        if(nums[n-2]<nums[n-1])
            return n-1;
        int index = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                index = mid;
            }
            if(nums[mid-1]<nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return index;

    }
}