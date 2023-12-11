package g0801_0900.s0892_surface_area_of_3d_shapes;

// #Easy #Array #Math #Matrix #Geometry #2022_03_28_Time_2_ms_(98.73%)_Space_44.8_MB_(37.55%)

public class Solution {
    public int surfaceArea(int[][] grid) {
        int surfaceArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    surfaceArea += 4 * grid[i][j] + 2;
                    surfaceArea -= hiddenSides(i, j, grid);
                }
            }
        }
        return surfaceArea;
    }

    private int hiddenSides(int i, int j, int[][] grid) {
        int hidden = 0;
        int tower = grid[i][j];
        if (j + 1 < grid[i].length && grid[i][j + 1] > 0) {
            hidden += Math.min(tower, grid[i][j + 1]);
        }
        if (j - 1 >= 0 && grid[i][j - 1] > 0) {
            hidden += Math.min(tower, grid[i][j - 1]);
        }
        if (i + 1 < grid.length && grid[i + 1][j] > 0) {
            hidden += Math.min(tower, grid[i + 1][j]);
        }
        if (i - 1 >= 0 && grid[i - 1][j] > 0) {
            hidden += Math.min(tower, grid[i - 1][j]);
        }
        return hidden;
    }
}
