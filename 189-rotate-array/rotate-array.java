class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //Reverse the array 
        reverse(nums, 0, n-1);

        //Reverse the first k element 
        reverse(nums,0,k-1);

        //Reverse the remaining n-k
        reverse(nums,k,n-1);

    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}