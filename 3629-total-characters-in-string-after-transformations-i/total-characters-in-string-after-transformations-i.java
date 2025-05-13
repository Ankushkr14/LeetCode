class Solution {
    public int lengthAfterTransformations(String s, int t) {
        long mod = 1000000007;
        long[] freq = new long[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        while(t-->0){
            long[] arr = new long[26];

            for(int i = 0;i<26;i++){
                if(i==25){
                    arr[0] = (arr[0]+ freq[25])%mod;
                    arr[1] = (arr[1]+freq[25])%mod;
                }else{
                    arr[i+1] = (arr[i+1]+freq[i])%mod; 
                }
            }

            freq = arr;
        }

        long count = 0;
        for(long num : freq){
            count += num;
        }
        return (int)(count%mod);

    }
}