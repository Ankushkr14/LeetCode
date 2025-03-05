class Solution {
    public long coloredCells(int n) {
        if(n==0){
            return 1;
        }
        n=n-1;
        long num = (long)n*(n+1)/2;
        long result = 4*(num) + 1;
        return result;
        
    }
}