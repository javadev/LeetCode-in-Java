package g2501_2600.s2556_disconnect_path_in_a_binary_matrix_by_at_most_one_flip;

// #Medium #Array #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Matrix
// #2023_08_19_Time_0_ms_(100.00%)_Space_54.4_MB_(97.73%)

public class Solution {
    private int n;
    private int m;

    public boolean isPossibleToCutPath(int[][] g) {
        n = g.length;
        m = g[0].length;
        if (!dfs(0, 0, g)) {
            return true;
        }
        g[0][0] = 1;
        return !dfs(0, 0, g);
    }

    private boolean dfs(int r, int c, int[][] g) {
        if (r == n - 1 && c == m - 1) {
            return true;
        }
        if (r == n || c == m || g[r][c] == 0) {
            return false;
        }
        g[r][c] = 0;
        return dfs(r, c + 1, g) || dfs(r + 1, c, g);
    }
}
