class Solution {
    public long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        
        return (int)(power(5, even) * power(4,odd) %MOD);
    }

    private long power(long n, long p){
        if(p == 0)
            return 1;
        
        long temp = power(n,p/2);
        if(p%2==0){
            return (temp*temp)%MOD;
        }else{
            return (n*temp*temp)%MOD;
        }
    } 
}