package g3201_3300.s3212_count_submatrices_with_equal_frequency_of_x_and_y;

// #Medium #Array #Matrix #Prefix_Sum #2024_07_09_Time_15_ms_(100.00%)_Space_117_MB_(99.13%)

public class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int[][] row = new int[n][2];
        for (char[] chars : grid) {
            int[] count = new int[2];
            for (int j = 0; j < n; j++) {
                if (chars[j] != '.') {
                    count[chars[j] - 'X']++;
                }
                row[j][0] += count[0];
                row[j][1] += count[1];
                if (row[j][0] > 0 && row[j][0] == row[j][1]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
