class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int para = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                para++;
                count = Math.max(para, count);
            }else if(ch == ')')
                para--;
            else
                continue;
        }
        return count;
    }
}