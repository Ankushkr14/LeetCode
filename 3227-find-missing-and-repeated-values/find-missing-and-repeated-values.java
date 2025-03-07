class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[n*n+1];

        for(int i = 0;i<n;i++){
            for(int j = 0; j<m;j++){
                arr[grid[i][j]]++;
            }
        }
        int a = -1;
        int b = -1;
        for(int i =0;i<=n*n;i++){
            if(arr[i] == 2){
                a = i;
            }else if(arr[i] == 0){
                b = i;
            }
        }

        return new int[]{a,b};

    }
}