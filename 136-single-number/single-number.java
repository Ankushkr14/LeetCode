class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                ans =  entry.getKey();
            }
        }
        return ans;
    }
}