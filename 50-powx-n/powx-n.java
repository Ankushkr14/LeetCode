class Solution {
    public double myPow(double x, int n) {
    
        long N = n;
        if(n==0){
            return 1;
        }
        if(n<0){
            x = 1/x;
            N= -n;
        }
        return power(x,N);
    }
    double power(double x, long N){
        if(N==0){
            return 1;
        }
        double temp= power(x, N/2);
        if(N%2==0){
            return temp *temp;
        }else{
            return temp*temp*x;
        }
    }
}