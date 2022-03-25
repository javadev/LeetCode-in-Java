package g0701_0800.s0749_contain_virus;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Simulation
// #2022_03_25_Time_23_ms_(37.62%)_Space_50.8_MB_(25.74%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("java:S107")
public class Solution {
    private int m;
    private int n;
    private final int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int containVirus(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int res = 0;
        while (true) {
            int id = 0;
            Set<Integer> visited = new HashSet<>();
            Map<Integer, Set<Integer>> islands = new HashMap<>();
            Map<Integer, Set<Integer>> scores = new HashMap<>();
            Map<Integer, Integer> walls = new HashMap<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1 && !visited.contains(i * n + j)) {
                        dfs(i, j, visited, grid, islands, scores, walls, id++);
                    }
                }
            }
            if (islands.isEmpty()) {
                break;
            }
            int maxVirus = 0;
            for (int i = 0; i < id; i++) {
                if (scores.getOrDefault(maxVirus, new HashSet<>()).size()
                        < scores.getOrDefault(i, new HashSet<>()).size()) {
                    maxVirus = i;
                }
            }
            res += walls.getOrDefault(maxVirus, 0);
            for (int i = 0; i < islands.size(); i++) {
                for (int island : islands.get(i)) {
                    int x = island / n;
                    int y = island % n;
                    if (i == maxVirus) {
                        grid[x][y] = -1;
                    } else {
                        for (int[] dir : dirs) {
                            int nx = x + dir[0];
                            int ny = y + dir[1];
                            if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 0) {
                                grid[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    private void dfs(
            int i,
            int j,
            Set<Integer> visited,
            int[][] grid,
            Map<Integer, Set<Integer>> islands,
            Map<Integer, Set<Integer>> scores,
            Map<Integer, Integer> walls,
            int id) {
        if (!visited.add(i * n + j)) {
            return;
        }
        islands.computeIfAbsent(id, value -> new HashSet<>()).add(i * n + j);
        for (int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x < 0 || x >= m || y < 0 || y >= n) {
                continue;
            }
            if (grid[x][y] == 1) {
                dfs(x, y, visited, grid, islands, scores, walls, id);
            }
            if (grid[x][y] == 0) {
                scores.computeIfAbsent(id, value -> new HashSet<>()).add(x * n + y);
                walls.put(id, walls.getOrDefault(id, 0) + 1);
            }
        }
    }
}
