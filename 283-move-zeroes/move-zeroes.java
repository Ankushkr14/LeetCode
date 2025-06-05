class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 0;
        while(i<n){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
                i++;
            }else{
                i++;
                count++;
            }
            
        }
        while(j<n){
            nums[j]=0;
            j++;
        }
    }
}