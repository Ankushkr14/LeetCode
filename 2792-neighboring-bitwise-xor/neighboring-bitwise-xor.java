class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int sum = 0;
        for(int num : derived){
            sum ^= num;
        }
        if(sum==0){
            return true;
        }
        return false;
    }
}