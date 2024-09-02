class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long sum = 0;
        for(int i = 0; i < n;i++){
            sum += (long)(chalk[i]);
        }
        int rem = (int)(k%sum);
        if(rem == 0){
            return 0;
        }
        for(int i = 0; i < n; i++){
            if(rem<chalk[i])
                return i;
            rem -= chalk[i];
        }
        return 0;
    }
}