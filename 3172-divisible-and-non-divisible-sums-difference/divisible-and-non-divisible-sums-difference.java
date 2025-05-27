class Solution {
    public int differenceOfSums(int n, int m) {
        int sum2 = 0;
        for(int i =1;i<=n;i++){
            if(i%m==0){
                sum2+=i;
            }
        }
        int sum1 = (int)(n*(n+1))/2-sum2;
        return sum1-sum2;
    }
}