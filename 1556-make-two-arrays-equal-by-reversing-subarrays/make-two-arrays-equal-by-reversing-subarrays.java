class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        for(int i =0;i<target.length;i++){
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}