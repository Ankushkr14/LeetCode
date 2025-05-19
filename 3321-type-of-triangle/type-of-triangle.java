class Solution {
    public String triangleType(int[] nums) {
        int side1 = nums[0] + nums[1];
        int side2 = nums[1] + nums[2];
        int side3 = nums[2] + nums[0];

        if(side1 <= nums[2] || side2 <= nums[0] || side3 <= nums[1]){
            return "none";
        }

        if(nums[0]==nums[1] && nums[1] == nums[2] && nums[0]==nums[2]){
            return "equilateral";
        }else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]){
            return "isosceles";
        }else{
            return "scalene";
        }
    }
}