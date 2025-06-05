class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i =0;i<n;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                arr[0] = map.get(diff);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }

        arr[0] = arr[1]= -1;
        return arr;
    }
}