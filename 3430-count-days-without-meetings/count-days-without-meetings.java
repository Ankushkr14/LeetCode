class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b)-> Integer.compare(a[0],b[0]));
        int count = 0;
        int n = meetings.length;
        int start = meetings[0][0];
        int end = meetings[0][1];
        for(int i = 1;i<n;i++){
            int newStart = meetings[i][0];
            int newEnd = meetings[i][1];
            if(newStart <= end){
                end = Math.max(end,newEnd);
            }else{
                count += (end - start + 1); 
                start = newStart;
                end = newEnd;
            }
        }
        count += (end-start)+1;


        return days-count;
    }
}