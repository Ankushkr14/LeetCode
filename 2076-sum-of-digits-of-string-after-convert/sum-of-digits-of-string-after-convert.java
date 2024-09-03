class Solution {
    private int sum(String sb){
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            int temp = sb.charAt(i) - '0';
            sum += temp;
        }
        return sum;
    }
    public int getLucky(String s, int k) {
        StringBuilder sc = new StringBuilder();
        for(char ch : s.toCharArray()){
            int value = ch - 'a'+1;
            sc.append(value);
        }
        int sum  = 0;
        String sb = sc.toString();

        while(k-- > 0){
            sum = sum(sb);
            sb = Integer.toString(sum);
        }
        return sum;
    }
}