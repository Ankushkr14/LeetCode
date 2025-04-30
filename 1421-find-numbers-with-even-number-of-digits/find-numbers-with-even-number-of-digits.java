class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0;i<n;i++){
            String s = Integer.toString(nums[i]);
            int size = s.length();
            if(size%2==0){
                count++;
            }
        }
        return count;
    }
}