package g3101_3200.s3128_right_triangles;

// #Medium #Array #Hash_Table #Math #Counting #Combinatorics
// #2024_05_02_Time_6_ms_(100.00%)_Space_145.9_MB_(90.67%)

public class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] columns = new int[n];
        int[] rows = new int[m];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                columns[i] += grid[i][j];
                rows[j] += grid[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += (long) grid[i][j] * (rows[j] - 1) * (columns[i] - 1);
            }
        }
        return sum;
    }
}
