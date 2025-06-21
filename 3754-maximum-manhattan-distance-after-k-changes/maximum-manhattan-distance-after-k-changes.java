class Solution {
    public int maxDistance(String s, int k) {
        int n = s.length();
        int east = 0;
        int west = 0;
        int north = 0;
        int south = 0;
        int max = 0;
        int steps = 0;
        int rem  = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'N')
                north++;
            if(ch == 'S')
                south++;
            if(ch == 'E')
                east++;
            if(ch == 'W')
                west++;
            steps++;
            int maxY = Math.abs(north-south);
            int maxX = Math.abs(east - west);
            int curr = maxY+maxX;
            int waste = steps - curr;
            if(curr != steps){
                rem = Math.min(2*k, waste);
            }
            max = Math.max(max, curr+rem);
        }   

            
        return max;
    }
}