class Solution {
    public int totalFruit(int[] fruits) {
        int n= fruits.length;
        int left = 0;
        int right = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(right = 0; right < n;right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);

            while(map.size() > 2){
                int fruit = fruits[left];
                map.put(fruit, map.get(fruit)-1);
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                left++;
            }

            count = Math.max(count , (right-left+1));
        }
        return count;
    }
}