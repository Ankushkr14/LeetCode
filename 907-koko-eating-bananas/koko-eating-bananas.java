class Solution {
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i= 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static int calc(int[] arr , int i){
        int hourly = 0;
        for(int j =0;j<arr.length;j++){
            hourly+=Math.ceil((double)(arr[j])/(double)(i));
        }
        return hourly;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        while(low<=high){
            int mid = (low+high)/2;
            int hour = calc(piles,mid);

            if(hour<=h){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return low;
    }
}