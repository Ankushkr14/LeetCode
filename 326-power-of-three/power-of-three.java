class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 0){
            return false;
        }
        if(n % 2==0){
            return false;
        }
        long pow = 1;
        while(pow < n){
            pow = pow*3;
        }
        if(pow == (long)(n)){
            return true;
        }
        return false;
    }
}