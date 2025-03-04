class Solution {
    public boolean checkPowersOfThree(int n) {
        int num = n;
        StringBuilder st = new StringBuilder();
        while(n>=0 && n!=1){
            if(n%3==2){
                return false;
            }else if(n%3==1){
                st.append('1');
            }else{
                st.append('0');
            }

            n /= 3;
        }

        return true;
    }
}