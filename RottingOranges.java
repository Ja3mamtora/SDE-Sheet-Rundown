import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] vis = new int[n][m];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    vis[i][j] = 1;
                    q.add(new int[] { i, j, 0 });
                } else if (grid[i][j] == 1) {
                    vis[i][j] = 0;
                } else {
                    vis[i][j] = 1;
                }
            }
        }
        int dx[] = { -1, 0, 1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        int maxi = Integer.MIN_VALUE;
        while (q.size() > 0) {
            int r = q.peek()[0];
            int c = q.peek()[1];

            int time = q.peek()[2];
            q.poll();
            maxi = Math.max(time, maxi);

            for (int k = 0; k < 4; k++) {
                int nr = dx[k] + r;
                int nc = dy[k] + c;

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 0) {
                    vis[nr][nc] = 1;
                    q.add(new int[] { nr, nc, time + 1 });
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0)
                    return -1;
            }
        }
        if (maxi == Integer.MIN_VALUE)
            return 0;
        return maxi;
    }
}
