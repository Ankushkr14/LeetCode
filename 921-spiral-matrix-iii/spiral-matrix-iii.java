class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
    int[][] dirt = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // east, south, west, north is 0, 1, 2, 3
    int[][] res = new int[R * C][2];
    int len = 0, d = 0, j = 0; // move <len> steps in the <d> direction
    res[j++] = new int[]{r0, c0};
    while (j < R * C) { // fill all the blanks
        if (d == 0 || d == 2) len++; // when move east or west, the length of path need plus 1 
        for (int i = 0; i < len; i++) {
            r0 += dirt[d][0];
            c0 += dirt[d][1];
            if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) // check valid
                res[j++] = new int[]{r0, c0};
        }
        d = (d + 1) % 4; // turn to next direction
    }
    return res; 
}
}