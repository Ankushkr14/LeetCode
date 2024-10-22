class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        int n = nums.length;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[first]=nums[i];
                first++;
            }
        }

        if(first<n){
            for(int i =first;i<n;i++){
                nums[i]=0;
            }
        }
    }
}