class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(n%2 !=0){
            arr.add(0);
        }            
        for(int i = 1;i<=n/2;i++){
            arr.add(i);
            arr.add(-i);
        }
        int[] ans = new int[n];
        for(int i = 0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}