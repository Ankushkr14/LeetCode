class Solution {
    public void reverse(char[] s, int l, int r){
        if(l>=r){
            return;
        }
        char str = s[l];
        s[l] = s[r];
        s[r] = str;

        reverse(s, l+1,r-1);
    }
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
}