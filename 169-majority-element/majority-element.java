class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm

        int count =0;
        int ele=0;
        int n = nums.length;

        for(int i=0;i< n;i++)
        {
            if(count == 0)
            {
                count =1;
                ele = nums[i];
            }

            else if(nums[i]==ele)
                count++;
            else
                count--;
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele)
                cnt++;
            if(cnt>n/2)
                return ele;
        }
        return -1;
    }
}