class Solution {
    public int numTilings(int n) {
        int M = 1000000007;
        if(n == 1 || n==2)
            return n;

        int[] arr = new int[1001];
        
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 5;
        
        for(int i = 4;i<=n;i++){
            arr[i] =(( 2*arr[i-1])%M + (arr[i-3])%M)%M;
        }
        return arr[n];
    }
}