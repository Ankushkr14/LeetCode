class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(n != m){
            return false;
        }
        String ch = s+s;

        if(ch.contains(goal)){
            return true;
        }
        return false;
    }
}