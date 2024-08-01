class Solution {
    public int countSeniors(String[] details) {
        int count =0;
       for (String detail : details){
            int n = Integer.parseInt(detail.substring(11, 13));
            if(n > 60 ){
                count++;
            }
        }
        return count;
    }
}