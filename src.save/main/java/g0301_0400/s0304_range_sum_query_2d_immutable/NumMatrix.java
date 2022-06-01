package g0301_0400.s0304_range_sum_query_2d_immutable;

// #Medium #Array #Matrix #Design #Prefix_Sum #Dynamic_Programming_I_Day_14
// #Programming_Skills_II_Day_13 #2022_03_14_Time_103_ms_(98.60%)_Space_64.7_MB_(96.34%)

public class NumMatrix {
    private int[][] tot;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        // The dimensions of this tot matrix is actually 1 bigger than the given matrix, cool!
        tot = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tot[i + 1][j + 1] = matrix[i][j] + tot[i + 1][j] + tot[i][j + 1] - tot[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return tot[row2 + 1][col2 + 1]
                - tot[row2 + 1][col1]
                - tot[row1][col2 + 1]
                + tot[row1][col1];
    }
}
