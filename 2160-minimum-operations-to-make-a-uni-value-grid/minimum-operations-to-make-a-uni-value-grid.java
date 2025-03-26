class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[m*n];
        int k = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[k] = grid[i][j];
                k++;
            }
        }

        Arrays.sort(arr);
        int len = arr.length;
        int a = arr[0]%x;
        for(int i = 1;i<len;i++){
            int b = arr[i]%x;
            if(a!=b){
                return -1;
            }
        }

        int median = len/2;
        int count = 0;

        for(int i = 0;i<len;i++){
            if(i == median){
                continue;
            }
            int diff = Math.abs(arr[i]-arr[median]);
            int times = diff/x;
            count+=times;
        }

        return count;
    }
}