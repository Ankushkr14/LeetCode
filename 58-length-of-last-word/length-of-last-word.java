class Solution {
    public int lengthOfLastWord(String s) {
        int end  = 0;
        int n = s.length()-1;
        while(n>=0){
            if(s.charAt(n)==' '){
                n--;
            }else{
                end = n;
                break;
            }
        }
        int start = end;
        while(start >= 0){
            if(s.charAt(start) == ' ')
                break;
            start--;
        }
        return end-start;
    }
}