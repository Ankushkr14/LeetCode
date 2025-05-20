class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int[] q : queries){
            int start = q[0];
            int end = q[1];
            arr[start]+=1;
            if(end+1<n){
                arr[end+1]-=1;
            }
        }

        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+= arr[i];
            arr[i] = sum;

            if(arr[i] < nums[i]){
                return false;
            }
        }   

        return true;
    }
}