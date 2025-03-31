class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n-1;i++){
            int sum = weights[i]+weights[i+1];
            arr.add(sum);
        }
        Collections.sort(arr);
        int m = arr.size()-1;
        long max = 0;
        long min = 0;
        for(int i = 0;i<k-1;i++){
            min+=arr.get(i);
            max+=arr.get(m-i);
        }
        return (max-min);
    }
}