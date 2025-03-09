class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int limit = n+k-1;
        int l = 0;
        int count = 0;

        while(l<n){
            int r = l+1;
            while(r<limit && colors[(r-1)%n]!=colors[r%n]){
                r++;
            }

            if(r-l >= k){
                count += (r-l)-k+1;
            }
            l = r;
        }

        return count;
    }
}