class Solution {
    public boolean isPalindrome(int x) {
        int temp = Math.abs(x);
        int newNum = 0;

        while(temp>0){
            int a = temp%10;
            newNum = newNum *10 +a;
            temp = temp/10;
        }
        
        if(x==newNum){
            return true;
        }
        return false;
    }
}