class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int x = horizontalCut.length-1;
        int y = verticalCut.length-1;

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        int verticalCount = 1;
        int horizontalCount = 1;

        long cost = 0;

        while(x>=0 && y >=0){
            if(horizontalCut[x]>=verticalCut[y]){
                cost+= (long)(horizontalCut[x]*verticalCount);
                horizontalCount++;
                x--;
            }
            else{
                cost+= (long)(verticalCut[y]*horizontalCount);
                verticalCount++;
                y--;
            }
        }
        while(x >=0){
            cost+= (long)(horizontalCut[x]*verticalCount);
            horizontalCount++;
            x--;   
        }
        while(y>=0){
            cost+= (long)(verticalCut[y]*horizontalCount);
            verticalCount++;
            y--;
        }
        return cost;
    }
}