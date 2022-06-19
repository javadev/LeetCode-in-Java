package g1701_1800.s1728_cat_and_mouse_ii;

// #Hard #Array #Dynamic_Programming #Math #Matrix #Graph #Memoization #Topological_Sort
// #Game_Theory #2022_04_28_Time_12_ms_(99.12%)_Space_42.7_MB_(96.49%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private static final int MOUSE_TURN = 0;
    private final List<Integer>[][] graphs = new List[2][];
    private int foodPos;
    private int[][][] memo;

    public boolean canMouseWin(String[] grid, int catJump, int mouseJump) {
        int m = grid.length;
        int n = grid[0].length();
        int mousePos = 0;
        int catPos = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == 'F') {
                    foodPos = i * n + j;
                } else if (c == 'C') {
                    catPos = i * n + j;
                } else if (c == 'M') {
                    mousePos = i * n + j;
                }
            }
        }
        graphs[0] = buildGraph(mouseJump, grid);
        graphs[1] = buildGraph(catJump, grid);
        memo = new int[m * n][m * n][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '#' || c == 'F') {
                    continue;
                }
                int catTurn = 1;
                dfs(i * n + j, foodPos, catTurn);
            }
        }
        return memo[mousePos][catPos][MOUSE_TURN] < 0;
    }

    private List<Integer>[] buildGraph(int jump, String[] grid) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int m = grid.length;
        int n = grid[0].length();
        List<Integer>[] graph = new List[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                List<Integer> list = new ArrayList<>();
                graph[i * n + j] = list;
                if (grid[i].charAt(j) == '#') {
                    continue;
                }
                list.add(i * n + j);
                for (int[] dir : dirs) {
                    for (int step = 1; step <= jump; step++) {
                        int x = i + dir[0] * step;
                        int y = j + dir[1] * step;
                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x].charAt(y) == '#') {
                            break;
                        }
                        list.add(x * n + y);
                    }
                }
            }
        }
        return graph;
    }

    private void dfs(int p1, int p2, int turn) {
        if (p1 == p2) {
            return;
        }
        if ((turn == 0 ? p2 : p1) == foodPos) {
            return;
        }
        if (memo[p1][p2][turn] < 0) {
            return;
        }
        memo[p1][p2][turn] = -1;
        turn ^= 1;
        for (int w : graphs[turn][p2]) {
            if (turn == MOUSE_TURN || ++memo[w][p1][turn] == graphs[turn][w].size()) {
                dfs(w, p1, turn);
            }
        }
    }
}
