class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m || n == 0){
            return false;
        }
        char S[] = s.toCharArray();
        char T[] = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        for(int i = 0 ;i<n;i++){
            if(S[i] != T[i])
                return false;
        } 
        return true;
    }
}