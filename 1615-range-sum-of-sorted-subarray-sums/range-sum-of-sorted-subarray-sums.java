class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size = (n*(n+1))/2;
        int[] arr = new int[size];
        int k =0;
        for(int i =0;i<n;i++){
            int sum =0;
            for(int j = i;j<n;j++){
                sum+=nums[j];
                arr[k]=sum;
                k++;
            }
        }
        Arrays.sort(arr);
        int sum =0;
        for(int i = left-1;i<right;i++){
            sum = (sum + arr[i]) % 1000000007;
        }
        return sum;
    }
}