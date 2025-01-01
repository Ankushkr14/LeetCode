class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int one = 0;
        int zero = 0;
        int ans = 0;
    
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='1')
                one++;
        }

        for(int i = 0;i<n-1;i++){
            if(s.charAt(i)=='1')
                one--;
            if(s.charAt(i)=='0')
                zero++;

            ans = Math.max(ans, (zero+one));
        }
        
        return ans;
    }
}