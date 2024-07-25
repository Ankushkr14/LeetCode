class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals. length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i< n; i++){
            if(list.isEmpty() || list.get(list.size()-1).get(1)<intervals[i][0]){
                list.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }else{
                list.get(list.size()-1).set(1, Math.max(list.get(list.size()-1).get(1),intervals[i][1]));
            }
        }
        int row = list.size();
        int col = list.get(0).size();
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=list.get(i).get(j);
            }
        }
        return arr;
    }
}