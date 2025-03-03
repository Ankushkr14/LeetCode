class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]<pivot){
                a.add(nums[i]);
            }else if(nums[i]>pivot){
                c.add(nums[i]);
            }else{
                b.add(nums[i]);
            }
        }
        int k = 0;
        for(int i =0;i<a.size();i++){
            nums[k] = a.get(i);
            k++;
        }
        for(int i =0;i<b.size();i++){
            nums[k]= b.get(i);
            k++;
        }
        for(int i = 0;i<c.size();i++){
            nums[k] =c.get(i);
            k++;
        }

        return nums;
        
    }
}