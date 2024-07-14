class Solution {
    private void callPermute(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;++i){
            if(freq[i])
                continue;
            if(i>0 && nums[i]==nums[i-1] && !freq[i-1])
                continue;
            freq[i]=true;
            ds.add(nums[i]);
            callPermute(nums, ans, ds, freq);
            ds.remove(ds.size()-1);
            freq[i]=false;
            
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        callPermute(nums, ans, ds, freq);
        return ans;
    }
}