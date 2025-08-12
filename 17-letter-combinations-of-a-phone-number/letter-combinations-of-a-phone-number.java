class Solution {
    public void solve(int idx, String digits, List<String> arr, Map<Character, String> map, StringBuilder str ){
        if(idx == digits.length()){
            arr.add(str.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));
        for(char letter : letters.toCharArray()){
            str.append(letter);
            solve(idx+1, digits, arr, map, str);
            str.deleteCharAt(str.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> arr = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return arr;
        }
        
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");


        solve(0, digits, arr, map, new StringBuilder());
        return arr;
    }
}