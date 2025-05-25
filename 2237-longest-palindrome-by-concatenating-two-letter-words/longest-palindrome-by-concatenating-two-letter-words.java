class Solution {
    public int longestPalindrome(String[] words) {
        int n = words.length;

        Map<String, Integer> map = new HashMap<>();
        for(String ch : words){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int len = 0;
        int count = 0;

        for(Map.Entry<String, Integer> e : map.entrySet()){
            String ch = e.getKey();
            int freq = e.getValue();
            String s = new StringBuilder(ch).reverse().toString();

            if(ch.equals(s)){
                len += (freq/2)*4;
                if(freq%2 ==1)
                    count = 1;
            }else if(ch.compareTo(s)< 0 && map.containsKey(s)){
                    len += Math.min(freq, map.get(s))*4;
            } 
        }

        return len+count*2;
    }
}