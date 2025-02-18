class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int index = 0;

        while(index<n && s.charAt(index) == ' '){
            index++;
        }

        int sign = 1;
        if(index<n &&(s.charAt(index)=='-' || s.charAt(index) == '+')){
            sign = s.charAt(index)=='-'?-1:1;
            index++;
        }

        int num = 0;

        while(index<n && s.charAt(index)>='0' && s.charAt(index)<='9'){
            int digit = s.charAt(index)-'0';

            if(num>(Integer.MAX_VALUE - digit)/10){
                return sign==1? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }

            num = num*10 + digit;
            index++;
        }

        return sign*num;


        
    }
}