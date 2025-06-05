class Solution {
    private boolean search(int[] matrix, int target){
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            if(matrix[i] == target){
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            int first = matrix[i][0];
            int last = matrix[i][m-1];
            if(target>= first && target <=last){
                return search(matrix[i], target);
            }
        }
        return false;
    }
}