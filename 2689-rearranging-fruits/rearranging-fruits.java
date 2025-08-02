class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int num : basket1){
            map.put(num, map.getOrDefault(num, 0)+1);
            min = Math.min(min, num);
        }

        for(int num : basket2){
            map.put(num, map.getOrDefault(num, 0)-1);
            min = Math.min(min, num);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value % 2 !=0){
                return -1;
            }
            for(int i = 0;i< Math.abs(value)/2;i++){
                arr.add(entry.getKey());
            }
        }
        Collections.sort(arr);
        long ans = 0;
        for(int i =0; i<arr.size()/2;i++){
            ans += Math.min(arr.get(i), min*2);
        }

        return ans;
    }
}