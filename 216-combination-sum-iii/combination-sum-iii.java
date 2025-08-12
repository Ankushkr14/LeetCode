class Solution {
    public void solve(int idx, int[] arr, List<List<Integer>> result, List<Integer> temp, int k , int n, int count){
        if(idx == arr.length ){
            if(count == k && n == 0){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        if(arr[idx] <= n){
            temp.add(arr[idx]);
            solve(idx + 1, arr, result, temp, k, n-arr[idx], count+1);
            temp.remove(temp.size()-1);
        }
        solve(idx + 1, arr, result, temp, k, n, count);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(0, arr, result, temp, k, n, 0);
        return result;
    }
}