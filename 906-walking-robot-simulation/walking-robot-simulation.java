import java.util.HashSet;
import java.util.Set;

class Solution {
  public int robotSim(int[] commands, int[][] obstacles) {
    final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // directions: north, east, south, west
    int ans = 0;
    int d = 0; // 0 := north, 1 := east, 2 := south, 3 := west
    int x = 0; // the start x
    int y = 0; // the start y
    Set<String> obstaclesSet = new HashSet<>(); // set to store obstacles

    // Convert obstacles into a set of strings like "x,y"
    for (int[] o : obstacles)
      obstaclesSet.add(o[0] + "," + o[1]);

    for (final int c : commands) {
      if (c == -1) { // turn right
        d = (d + 1) % 4;
      } else if (c == -2) { // turn left
        d = (d + 3) % 4;
      } else {
        for (int step = 0; step < c; ++step) {
          // Calculate the next position
          int nextX = x + dirs[d][0];
          int nextY = y + dirs[d][1];
          
          // Check if the next position is an obstacle
          if (obstaclesSet.contains(nextX + "," + nextY))
            break;
          
          // Move to the next position
          x = nextX;
          y = nextY;
        }
      }
      ans = Math.max(ans, x * x + y * y); // update the max Euclidean distance squared
    }

    return ans;
  }
}
