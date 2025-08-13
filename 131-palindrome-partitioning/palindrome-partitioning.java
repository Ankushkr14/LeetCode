class Solution {
    public boolean check(String str, int start, int end){
        while(start <= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void solve (int idx, String s, List<List<String>> result, List<String> temp){
        if(idx == s.length()){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx; i<s.length();i++){
            if(check(s, idx, i)){
                temp.add(s.substring(idx, i+1));
                solve(i + 1, s, result, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        solve(0, s, result, temp);
        return result;
    }
}