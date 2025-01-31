class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        

        for(int i=0;i<nums.length;i++){
            int a = (i+k)%nums.length;
            arr[a] = nums[i];
        }

        for(int i =0; i<arr.length;i++){
            nums[i]= arr[i];
        }
    }
}