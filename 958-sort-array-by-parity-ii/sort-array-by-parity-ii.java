class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pos =0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[pos]=nums[i];
                pos+=2;
            }
            else{
                arr[neg] = nums[i];
                neg+=2;
            }
        }
        return arr;
    }
}