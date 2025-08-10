class Solution {
    public void subset(int idx, int[] nums, List<List<Integer>> arr, List<Integer> temp){
        if(idx >= nums.length){
            if(!arr.contains(temp)){
                            arr.add(new ArrayList<>(temp));
            }

            return;
        }

        temp.add(nums[idx]);
        subset(idx+1, nums, arr, temp);
        temp.remove(temp.size()-1);
        subset(idx+1, nums, arr, temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        subset(0, nums, arr, temp);
        return arr;
    }
}