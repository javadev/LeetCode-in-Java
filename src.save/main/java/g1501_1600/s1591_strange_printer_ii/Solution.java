package g1501_1600.s1591_strange_printer_ii;

// #Hard #Array #Matrix #Graph #Topological_Sort
// #2022_04_11_Time_12_ms_(90.00%)_Space_53.9_MB_(71.25%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPrintable(int[][] targetGrid) {
        int[][] colorBound = new int[61][4];
        Set<Integer> colors = new HashSet<>();
        // prepare colorBound with Max and Min integer for later compare
        for (int i = 0; i < colorBound.length; i++) {
            for (int j = 0; j < colorBound[0].length; j++) {
                if (j == 0 || j == 1) {
                    colorBound[i][j] = Integer.MAX_VALUE;
                } else {
                    colorBound[i][j] = Integer.MIN_VALUE;
                }
            }
        }
        // find the color range for each color
        // each color i has a colorBound[i] with {min_i, min_j, max_i, max_j}
        for (int i = 0; i < targetGrid.length; i++) {
            for (int j = 0; j < targetGrid[0].length; j++) {
                colorBound[targetGrid[i][j]][0] = Math.min(colorBound[targetGrid[i][j]][0], i);
                colorBound[targetGrid[i][j]][1] = Math.min(colorBound[targetGrid[i][j]][1], j);
                colorBound[targetGrid[i][j]][2] = Math.max(colorBound[targetGrid[i][j]][2], i);
                colorBound[targetGrid[i][j]][3] = Math.max(colorBound[targetGrid[i][j]][3], j);
                colors.add(targetGrid[i][j]);
            }
        }
        boolean[] printed = new boolean[61];
        boolean[][] visited = new boolean[targetGrid.length][targetGrid[0].length];
        // DFS all the colors, skip the color already be printed
        for (Integer color : colors) {
            if (printed[color]) {
                continue;
            }
            if (!dfs(targetGrid, printed, colorBound, visited, color)) {
                return false;
            }
        }
        // if all color has been printed, then return true
        return true;
    }

    private boolean dfs(
            int[][] targetGrid,
            boolean[] printed,
            int[][] colorBound,
            boolean[][] visited,
            int color) {
        printed[color] = true;
        for (int i = colorBound[color][0]; i <= colorBound[color][2]; i++) {
            for (int j = colorBound[color][1]; j <= colorBound[color][3]; j++) {
                // if i, j is already visited, skip
                if (visited[i][j]) {
                    continue;
                }
                // if we find a different color, then check if the color is already printed, if so,
                // return false
                // otherwise, dfs the range of the new color
                if (targetGrid[i][j] != color) {
                    if (printed[targetGrid[i][j]]) {
                        return false;
                    }
                    if (!dfs(targetGrid, printed, colorBound, visited, targetGrid[i][j])) {
                        return false;
                    }
                }
                visited[i][j] = true;
            }
        }
        return true;
    }
}
