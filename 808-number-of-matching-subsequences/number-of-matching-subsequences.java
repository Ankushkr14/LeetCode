class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str, 0)+1);
        }


        char ch[] = s.toCharArray();
        int count = 0;
        for(String str: map.keySet()){
            char temp[] = str.toCharArray();
            int i = 0;
            int j = 0;
            while(i < ch.length && j< temp.length){
                if(temp[j]== ch[i]){
                    j++;
                }
                i++;
            }

            if(j == temp.length){
                count+=map.get(str);
            }
        }
        return count;
    }
}