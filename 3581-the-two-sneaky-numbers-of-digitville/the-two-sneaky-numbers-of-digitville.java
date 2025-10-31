class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int value = entry.getValue();
            if(value >= 2){
                arr.add(entry.getKey());
            }
        }

        int[] ans = new int[arr.size()];
        int i = 0;
        for(int num : arr){
            ans[i] = arr.get(i);
            i++;
        }
        return ans;

    }
}