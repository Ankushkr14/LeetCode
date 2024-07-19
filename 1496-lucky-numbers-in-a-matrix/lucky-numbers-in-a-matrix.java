class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int columnIndex =-1;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    columnIndex = j;
                }
            }
            boolean isLucky = true;
            for(int k=0;k<n;k++){
                if(matrix[k][columnIndex]>min){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){
                list.add(min);
            }
        }

        return list;
    }
}