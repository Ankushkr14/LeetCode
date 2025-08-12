class Solution {
    void solve(int idx, int[] array, int target, List<List<Integer>> arr, List<Integer> temp){
        
        if(idx == array.length){
            if(target == 0){
                arr.add(new ArrayList<>(temp));
            }
            return;
        }
        
        if(array[idx] <= target){
            temp.add(array[idx]);
            solve(idx, array, target - array[idx], arr, temp);
            temp.remove(temp.size()-1);
        }
        
        
        solve(idx + 1, array, target, arr, temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();

        solve(0, candidates, target, arr, temp);
        return arr;
    }
}