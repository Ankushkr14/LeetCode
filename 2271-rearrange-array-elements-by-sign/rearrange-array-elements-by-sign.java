class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int num : nums){
            if(num<0)
                arr1.add(num);
            else
                arr2.add(num);
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=arr2.get(i);
            nums[2*i+1]=arr1.get(i);
        }
        
        return nums;
    }
}