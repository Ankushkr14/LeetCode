class Solution {
    List<List<Integer>> arr = new ArrayList<>();
    
    public void calculate(int n, int[] nums, int i, List<Integer> temp){
        if(i>=n){
            arr.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        calculate(n, nums, i+1, temp);
        temp.remove(temp.size()-1);
        calculate(n, nums, i+1, temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();
        calculate(n, nums, 0, temp);
        return arr;
    }
}