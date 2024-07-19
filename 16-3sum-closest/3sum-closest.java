class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        int closetSum = nums[0]+nums[1]+nums[2];

        for(int i=0;i<n;i++){
            
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                sum = nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return sum;
                if(Math.abs(sum - target)<Math.abs(closetSum-target))
                    closetSum = sum;
                if(sum<target)
                    j++;
                else
                    k--;
            }
        }
        return closetSum;
    }
}