class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]%2==0){    
                int value = map.getOrDefault(nums[i], 0);
                map.put(nums[i],value+1);
            }
        }
        int curr =Integer.MAX_VALUE;
        boolean found= false;
        int currFreq =0;
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            int number = it.getKey();
            int freq = it.getValue();
            if(freq > currFreq || currFreq == freq && number < curr ){
                curr = number;
                currFreq = freq;
                found = true;
            }
        }
        return found ? curr:-1;

    }
}