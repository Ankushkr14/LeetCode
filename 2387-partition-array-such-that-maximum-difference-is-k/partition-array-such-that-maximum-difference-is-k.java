class Solution {
    public int partitionArray(int[] nums, int k) {
        int count = 1;
        Arrays.sort(nums);
        int minVal = nums[0];
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]-minVal > k){
                count++;
                minVal = nums[i];
            }
        }
        return count;
    }
}