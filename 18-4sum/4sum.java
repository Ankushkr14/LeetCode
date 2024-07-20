class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums==null || n<4){
            return new ArrayList<>();
        }
        
        HashSet<List<Integer>> list = new HashSet<>();
      
        

        for(int i=0;i<n-3;i++){

            for(int j=i+1;j<n-2;j++){


                int k = j+1;
                int l = n-1;

                while(k<l){
                    long sum = (long)nums[i]+  (long)nums[j]+  (long)nums[k]+  (long)nums[l];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k],nums[l]);
                            list.add(temp);
                            k++;
                            l--;
                    }else if(sum>target)
                            l--;
                    else
                        k++;
                }
            }

        }
        return new ArrayList<>(list);
    }
}