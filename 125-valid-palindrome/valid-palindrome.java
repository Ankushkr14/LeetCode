class Solution {
    private boolean check(String str, int n, int i){
        if(i>=n){
            return true;
        }
        if(str.charAt(i) != str.charAt(n)){
            return false;
        }
        return check(str, n-1, i+1);
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(s, s.length()-1, 0);
    }
}