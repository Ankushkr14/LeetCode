class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int top=0,right=n-1;
        int left =0, bottom=n-1;
        
        int a =1;
        while(a<=n*n){
            for(int i=left;i<=right;i++){
                arr[top][i]=a++;
                
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=a++;
                
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=a++;
                    
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=a++;
                    
                }
                left++;
            }
        }
        return arr;
    }
}