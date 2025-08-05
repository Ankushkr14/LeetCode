class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        int[] arr = new int[m];

        for(int i = 0;i<m;i++){
            arr[i] = 0;
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m ;j++){
                if(fruits[i] <= baskets[j]){
                    if(arr[j] == 0){
                        arr[j] = 1;
                        count++;
                        break;
                    }
                }
            }
        }
        return n-count;
    }
}