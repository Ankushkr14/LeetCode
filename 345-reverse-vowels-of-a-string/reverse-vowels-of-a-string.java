class Solution {
    public String reverseVowels(String s) {
        char[] words = s.toCharArray();
        int n = words.length;
        String vowel = "aeiouAEIOU";
        int l = 0;
        int r = n-1;
        while(l < r){
            while(l<r && vowel.indexOf(words[l]) == -1){
                l++;
            }
            while(l < r && vowel.indexOf(words[r])== -1){
                r--;
            }
            char ch = words[l];
            words[l] = words[r];
            words[r] = ch;
            l++;
            r--;
        }
        String ans = new String(words);
        return ans;
    }
}