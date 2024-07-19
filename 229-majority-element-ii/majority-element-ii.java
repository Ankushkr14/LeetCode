class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int cnt1=0, cnt2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(cnt1==0 && ele2!=nums[i]){
                cnt1=1;
                ele1=nums[i];
            }else if(cnt2 == 0 && ele1 != nums[i]){
                cnt2=1;
                ele2=nums[i];
            }else if(ele1==nums[i]){
                cnt1++;
            }else if(ele2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int count1 =0;
        int count2 =0;

        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                count1++;
            }
            if(nums[i]==ele2){
                count2++;
            }
        }
        if(count1>n/3)
            list.add(ele1);
        if(count2>n/3)
            list.add(ele2);
        return list;
    }
}