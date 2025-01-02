class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int m = words.length;

        int[] result = new int[n];

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int[] sum = new int[m+1];

        for(int i =0;i<m;i++){
            String curr = words[i];

            if(vowels.contains(curr.charAt(0))&& vowels.contains(curr.charAt(curr.length()-1))){
                sum[i+1] = 1 + sum[i];
            }else{
                sum[i+1] = sum[i]; 
            }
        }

        for(int i=0;i<n;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = sum[end+1] -sum[start];
        }
        return result;
    }
}