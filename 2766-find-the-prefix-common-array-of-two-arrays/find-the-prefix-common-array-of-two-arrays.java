class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<n;i++){
            map.put(A[i],i);
        }

        for(int i=0; i<n; i++){
            int count =0;
            for(int j =0;j<=i;j++){
                if(map.get(B[j])<=i){
                    count++;
                }
            }
            C[i]=count;
        }
        return C;
    }
}