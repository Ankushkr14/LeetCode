class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n==0){
            return nums2;
        }
        if(m==0){
            return nums1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while(i<n && j<m){
            if(nums1[i][0] == nums2[j][0]){
                int value = nums1[i][1] + nums2[j][1];
                map.put(nums1[i][0], value);
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                map.put(nums1[i][0], nums1[i][1]);
                i++;
            }else{
                map.put(nums2[j][0], nums2[j][1]);
                j++;
            }
        }

        while(i<n){
            map.put(nums1[i][0], nums1[i][1]);
            i++;
        }

        while(j<m){
            map.put(nums2[j][0],nums2[j][1]);
            j++;
        }
        int k = 0;
        int[][] temp = new int[map.size()][2];
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            temp[k][0] = pair.getKey();
            temp[k][1] = pair.getValue();
            k++;
        }
        Arrays.sort(temp,(a,b) -> a[0]-b[0]);

        return temp;
    }
}