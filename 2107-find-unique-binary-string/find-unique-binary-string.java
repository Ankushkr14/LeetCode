class Solution {
    public static String generateBinary(int n,int length) {
        StringBuilder bin = new StringBuilder();

            while (n > 0) {
                int bit = n & 1;
                bin.append(bit);
                n = n >> 1;
            }

            while (bin.length() < length) {
                bin.append('0');
            }

            return bin.reverse().toString();
    }

    public String findDifferentBinaryString(String[] nums) {
        Set<String> temp = new HashSet<>();

        for(int i =0;i<nums.length;i++){
            temp.add(nums[i]);
        }

        int n = nums[0].length();

        for(int i =0;i<((1 << n));i++){
            String ch = generateBinary(i,n);
            if(temp.contains(ch)){
                continue;
            }else{
                return ch;
            }
        }

        return "";
    }
}