class Solution {
    private int min(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i =0;i<arr.length;i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }


    private int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }

    private int calc(int[] nums, int mid){
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)(nums[i])/(double)(mid));
        }
        return sum; 
    } 

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        if(nums.length>threshold)
            return -1;
        while(low<=high){
            int mid = (low+high)/2;
            int ans = calc(nums, mid);
            if(ans <= threshold){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return low;
    }
}