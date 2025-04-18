class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String prev = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        
        int i = 0;
        while (i < prev.length()) {
            int count = 1;
            while (i + 1 < prev.length() && prev.charAt(i) == prev.charAt(i + 1)) {
                i++;
                count++;
            }
            res.append(count).append(prev.charAt(i));
            i++;
        }
        
        return res.toString();
    }
}