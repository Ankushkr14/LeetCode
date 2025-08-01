class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int value = 1;
            for(int c = 1;c<i;c++){

                value = value * (i-c);
                value /= c;

                temp.add(value);
            }
            arr.add(temp);

        }
        return arr;
    }
}