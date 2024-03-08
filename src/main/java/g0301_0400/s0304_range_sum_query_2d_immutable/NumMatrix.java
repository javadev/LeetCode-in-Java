package g0301_0400.s0304_range_sum_query_2d_immutable;

// #Medium #Array #Matrix #Design #Prefix_Sum #Dynamic_Programming_I_Day_14
// #Programming_Skills_II_Day_13 #Udemy_2D_Arrays/Matrix
// #2022_07_07_Time_153_ms_(87.51%)_Space_133.5_MB_(19.29%)

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

/*
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
