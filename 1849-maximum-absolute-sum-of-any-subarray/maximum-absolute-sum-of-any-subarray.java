class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int temp = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int num : nums){
            temp += num;
            if(temp > maxValue){
                maxValue = temp;
            }
            if(temp <0){
                temp = 0;
            }
        }

        int minValue = Integer.MAX_VALUE;
        int newTemp = 0;

        for(int num : nums){
            newTemp += num;
            if(newTemp < minValue){
                minValue = newTemp;
            }
            if(newTemp > 0){
                newTemp = 0;
            }
        }

        int sum = Math.max(Math.abs(maxValue), Math.abs(minValue));
        return sum;
    }
}