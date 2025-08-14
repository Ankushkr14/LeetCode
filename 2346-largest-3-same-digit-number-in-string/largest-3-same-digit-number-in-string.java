class Solution {
    public String largestGoodInteger(String num) {
        List<String> arr = List.of("999", "888", "777", "666", "555", "444", "333", "222", "111", "000");

        for(String str : arr){
            if(num.contains(str)){
                return str;
            }
        }

        return "";
    }
}