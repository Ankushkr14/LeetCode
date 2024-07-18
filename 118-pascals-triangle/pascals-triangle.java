class Solution {
    public List<Integer> generateRow(int r){
        int ans = 1;
        int rem = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int i=1;i<r;i++){
            rem = rem*(r - i);
            rem = rem/i;
            temp.add(rem);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
             result.add(generateRow(i));
        }
        return result;
    }
}