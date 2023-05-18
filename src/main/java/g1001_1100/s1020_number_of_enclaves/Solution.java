package g1001_1100.s1020_number_of_enclaves;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #Graph_Theory_I_Day_3_Matrix_Related_Problems
// #2022_02_25_Time_6_ms_(68.24%)_Space_66.4_MB_(15.35%)

public class Solution {
    private void walk(int[][] a, boolean[][] visited, int x, int y) {
        if (x >= a.length || x < 0 || y >= a[0].length || y < 0) {
            return;
        }
        if (visited[x][y]) {
            return;
        }
        if (a[x][y] == 0) {
            return;
        }
        visited[x][y] = true;
        walk(a, visited, x - 1, y);
        walk(a, visited, x, y - 1);
        walk(a, visited, x, y + 1);
        walk(a, visited, x + 1, y);
    }

    public int numEnclaves(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; ++i) {
            walk(a, visited, i, 0);
            walk(a, visited, i, m - 1);
        }
        for (int j = 0; j < m; ++j) {
            walk(a, visited, 0, j);
            walk(a, visited, n - 1, j);
        }
        int unreachables = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (a[i][j] == 1 && !visited[i][j]) {
                    ++unreachables;
                }
            }
        }
        return unreachables;
    }
}
