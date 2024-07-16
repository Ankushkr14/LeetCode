class Solution {
    private int countNeighbor(int[][] board, int r, int c) {
        int count =0;
        for(int i=r-1;i<r+2;i++){
            for(int j=c-1;j<c+2;j++){
                if(i<0 || j<0 || i==board.length || j==board[0].length || (i==r && j==c))
                    continue;
                
                if(board[i][j]==1 || board[i][j]==3)
                    count++;
            }
        }
        return count;
    }

    public void gameOfLife(int[][] board) {
        int len = board.length;
        int row = len;
        int col = board[0].length;

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                int n = countNeighbor(board, r, c);

                if(board[r][c]==1 && (n==2 || n==3))
                    board[r][c] = 3;
                else if(n==3)
                    board[r][c]=2;
            }}
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(board[i][j]==3)
                        board[i][j]=1;
                    else if(board[i][j]==2)
                        board[i][j]=1;
                    else
                        board[i][j]=0;
                }
            }
        
    
    }
}
