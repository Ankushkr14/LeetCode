class Solution {
    private void callPermute(List<List<Integer>> ans, int[] nums, boolean[] freq,List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                callPermute(ans,nums,freq,ds);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();
        callPermute(ans, nums, freq, ds);
        return ans;
    }
}