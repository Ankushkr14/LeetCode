class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        int[] prefixSum = new int[words.length+1];
        int n = words.length;

        for(int i =0 ; i<n; i++){
            String curr = words[i];
            if(vowels.contains(curr.charAt(0)) && vowels.contains(curr.charAt(curr.length() - 1))){
                prefixSum[i+1]= 1+prefixSum[i];
            }else{
                prefixSum[i+1]= prefixSum[i];
            }
        }

        for(int i =0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];

            ans[i]= prefixSum[end+1]-prefixSum[start];
        }

        return ans;
        
    }
}