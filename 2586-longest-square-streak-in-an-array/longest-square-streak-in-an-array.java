class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = -1;

        for(int num : nums){
            int sqrt = (int)(Math.sqrt(num));
            if(sqrt*sqrt == num && map.containsKey(sqrt)){
                map.put(num, map.get(sqrt)+1);
                count = Math.max(count, map.get(num));
            }else{
                map.put(num, 1);
            }
        }
        return count;
    }
}