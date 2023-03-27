package g2001_2100.s2022_convert_1d_array_into_2d_array;

// #Easy #Array #Matrix #Simulation #2022_05_25_Time_8_ms_(40.41%)_Space_119.4_MB_(53.92%)

public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;
        if (m * n != size) {
            return new int[][] {};
        }
        int[][] ans = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[k++];
            }
        }
        return ans;
    }
}
