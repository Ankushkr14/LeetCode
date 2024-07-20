class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] arr = new int[n][m];

        int i =0; int j=0;
        while(i<n && j<m){
            int ans = Math.min(rowSum[i], colSum[j]);
            rowSum[i]= rowSum[i]-ans;
            colSum[j]= colSum[j]-ans;
            arr[i][j]=ans;
            if(rowSum[i]==0)
                i++;
            if(colSum[j]==0)
                j++;
        }
        return arr;
    }
}