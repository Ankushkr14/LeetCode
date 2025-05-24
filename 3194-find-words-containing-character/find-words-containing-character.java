class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<n;i++){
            String ch = words[i];
            if(ch.indexOf(x) != -1){
                arr.add(i);
            }
        }
        return arr;
    }
}