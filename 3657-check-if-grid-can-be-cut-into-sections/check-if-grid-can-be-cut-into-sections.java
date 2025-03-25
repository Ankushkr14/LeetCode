class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return isValidCut(rectangles, 0, 0, 2) || isValidCut(rectangles, 1, 1, 3);
    }

    private boolean isValidCut(int[][] rectangles, int sortIndex, int start, int end) {
        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));

        int currentStart = rectangles[0][start];
        int currentEnd = rectangles[0][end];
        int intervals = 0;

        for (int[] rect : rectangles) {
            if (rect[start] < currentEnd) {
                currentEnd = Math.max(rect[end], currentEnd);
            } else {
                intervals++;
                currentStart = rect[start];
                currentEnd = rect[end];
            }
        }
        intervals++;

        return intervals > 2;
    }
}