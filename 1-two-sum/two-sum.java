class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int arr[] = new int[2];
        arr[0]=arr[1]=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int need = target - nums[i];
            if(map.containsKey(need))
            {
                arr[0]=map.get(need);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}