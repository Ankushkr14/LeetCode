class Solution {
    public void sum(int idx, int n, int[] candidates, List<Integer> temp, List<List<Integer>> arr,int target){
        if(idx == n){
            if(target == 0){
                arr.add(new ArrayList<>(temp));
            }
            return;
        }

        if(candidates[idx] <= target){
            temp.add(candidates[idx]);
            sum(idx, n, candidates, temp, arr, target-candidates[idx]);
            temp.remove(temp.size()-1);
        }
        sum(idx+1, n, candidates, temp, arr, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();

        int n = candidates.length;
        sum(0, n,candidates,  temp, arr, target);
        return arr;
    }
}