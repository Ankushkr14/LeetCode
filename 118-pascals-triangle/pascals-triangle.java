class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int j=0;j<numRows;j++){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<=j;i++){
                if(i==0 || i==j){
                    ds.add(1);
                }else{
                    int sum = list.get(j-1).get(i-1)+list.get(j-1).get(i);
                    ds.add(sum);
                }
            }
            list.add(ds);
        }

        return list;

    }
}