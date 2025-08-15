class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        int k = (int) (Math.log(n) / Math.log(4));
        double pow = Math.pow(4, k);
        return pow == n || Math.pow(4, k + 1) == n;
    }
}
