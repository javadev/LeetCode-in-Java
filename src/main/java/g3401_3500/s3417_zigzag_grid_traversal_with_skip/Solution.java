package g3401_3500.s3417_zigzag_grid_traversal_with_skip;

// #Easy #2025_01_14_Time_1_(100.00%)_Space_45.81_(35.36%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int i = 0;
        boolean flag = true;
        boolean skip = false;
        while (i < m) {
            if (flag) {
                for (int j = 0; j < n; j++) {
                    if (!skip) {
                        ans.add(grid[i][j]);
                    }
                    skip = !skip;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    if (!skip) {
                        ans.add(grid[i][j]);
                    }
                    skip = !skip;
                }
            }
            flag = !flag;
            i++;
        }
        return ans;
    }
}
