package g1901_2000.s1992_find_all_groups_of_farmland;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #2022_05_19_Time_7_ms_(89.08%)_Space_52.1_MB_(87.32%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<int[]> res = new ArrayList<>();

    public int[][] findFarmland(int[][] land) {
        if (land == null || land.length == 0) {
            return new int[][] {};
        }
        int m = land.length;
        int n = land[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int[] dirs = new int[4];
                    dirs[0] = i;
                    dirs[1] = j;
                    dirs[2] = i;
                    dirs[3] = j;
                    dfs(land, i, j, dirs);
                    res.add(dirs);
                }
            }
        }
        return res.toArray(new int[0][]);
    }

    private void dfs(int[][] land, int i, int j, int[] dirs) {
        if (i < 0 || i >= land.length || j < 0 || j >= land[0].length || land[i][j] != 1) {
            return;
        }
        land[i][j] = -1;
        dfs(land, i + 1, j, dirs);
        dfs(land, i, j + 1, dirs);
        dirs[0] = Math.min(dirs[0], i);
        dirs[1] = Math.min(dirs[1], j);
        dirs[2] = Math.max(dirs[2], i);
        dirs[3] = Math.max(dirs[3], j);
    }
}
