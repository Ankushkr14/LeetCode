class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, right = m-1;
        int left =0, bottom = n-1;
        List<Integer> arr = new ArrayList<>();

        if(matrix == null || matrix.length ==0|| matrix[0].length ==0){
            return arr;
        }
        
        
        while(arr.size()<m*n){
            for(int i = left; i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}