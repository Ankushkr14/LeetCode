class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m ;j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;
                    count++;
                    break;
                }
            }
        }
        return n-count;
    }
}