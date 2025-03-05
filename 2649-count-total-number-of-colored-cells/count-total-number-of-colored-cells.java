class Solution {
    public long coloredCells(int n) {
        // if(n==0){
        //     return 1;
        // }
        // n=n-1;
        // long num = (long)n*(n+1)/2;
        // long result = 4*(num) + 1;
        // return result;

        long four = 4;
        long blue = 1;

        for(int i = 1;i<n;i++){
            blue += four;
            four += 4;
        }
        return blue;
        
        
    }
}