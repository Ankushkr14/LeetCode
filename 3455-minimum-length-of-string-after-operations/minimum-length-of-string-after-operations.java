class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int delete = 0;

        for(int freq : map.values()){
            if(freq % 2==0){
                delete += freq-2;
            }else{
                delete += freq-1;
            }
        }

        return n-delete;
    }
}