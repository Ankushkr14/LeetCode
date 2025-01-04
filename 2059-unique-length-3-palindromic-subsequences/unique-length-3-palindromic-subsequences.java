class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> map = new HashSet<>();
        for(char ch : s.toCharArray()){
            map.add(ch);
        }

        int count = 0;
        for(char ch : map){
            int i = -1;
            int j = 0;

            for(int k = 0; k < s.length(); k++){
                if(s.charAt(k)==ch){
                    if(i==-1){
                        i=k;
                    }
                    j=k;
                }
            }

            Set<Character> set = new HashSet<>();
            for(int k = i+1; k<j;k++){
                set.add(s.charAt(k));
            }
            count += set.size();
        }
        return count;
    }
}