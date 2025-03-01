class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i = 0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] = (int)(nums[i]* 2);
                nums[i+1] = 0;
                i++;
            }
        }
        int j =0;
        int[] temp = new int[n];
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
        }
        return temp;
    }   
}