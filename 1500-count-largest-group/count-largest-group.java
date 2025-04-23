class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0;

        for(int i = 1; i<=n;i++){
            int num = 0;
            int b = i;
            while(b!=0){
                int a = b%10;
                num+=a;
                b/=10;
            }
            map.put(num,map.getOrDefault(num,0)+1);
            maxValue = Math.max(maxValue, map.get(num));
        }
        int count = 0;

        for(Map.Entry<Integer, Integer> entryMap : map.entrySet()){
            if(entryMap.getValue() == maxValue){
                count++;
            }
        }
        return count;
    }
}