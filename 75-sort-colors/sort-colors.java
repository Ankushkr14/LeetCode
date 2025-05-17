class Solution {
    public void sortColors(int[] nums) {
        int one = 0;
        int zero = 0;
        int two = 0;

        for(int num: nums){
            if(num == 0){
                zero++;
            }else if(num == 1){
                one++;
            }else{
                two++;
            }
        }
        int i = 0;
        int j = zero;
        int k = one;
        while(zero-->0){
            nums[i]=0;
            i++;
        }
        while(one-->0){
            nums[i]=1;
            i++;
        }
        while(two-->0){
            nums[i] =2;
            i++;
        }
    }
}