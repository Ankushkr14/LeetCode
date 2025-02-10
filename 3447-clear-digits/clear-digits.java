class Solution {
    public String clearDigits(String s) {
        StringBuilder temp = new StringBuilder(s);
        int charIndex = 0;

        while(charIndex < temp.length()){
            if(Character.isDigit(temp.charAt(charIndex))){
                temp.deleteCharAt(charIndex);
                if(charIndex > 0 ){
                    temp.deleteCharAt(charIndex-1);
                    charIndex--;
                }
            }else{
                charIndex++;
            }
        }
        return temp.toString();
    }
}