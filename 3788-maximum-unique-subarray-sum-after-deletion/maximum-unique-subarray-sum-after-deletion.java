class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        Arrays.sort(nums);
        for(int num : nums){
            if(set.contains(num)){
                continue;
            }else{
                set.add(num);
                if(num > 0){
                    sum+=num;
                }
            }
        }
        if(sum == 0){
            return nums[nums.length-1];
        }
        return sum;
    }
}