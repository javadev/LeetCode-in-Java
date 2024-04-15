package g0301_0400.s0329_longest_increasing_path_in_a_matrix;

// #Hard #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Graph #Memoization
// #Topological_Sort #2022_07_09_Time_8_ms_(97.60%)_Space_54.7_MB_(19.13%)

public class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int maxIncreasingSequenceCount = 0;
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int[][] memory = new int[n + 1][m + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                maxIncreasingSequenceCount =
                        Math.max(maxIncreasingSequenceCount, move(i, j, n, m, matrix, memory));
            }
        }
        return maxIncreasingSequenceCount;
    }

    private int move(int row, int col, int n, int m, int[][] matrix, int[][] memory) {
        if (memory[row][col] == 0) {
            int count = 1;
            // move down
            if (row < n && matrix[row + 1][col] > matrix[row][col]) {
                count = Math.max(count, move(row + 1, col, n, m, matrix, memory) + 1);
            }
            // move right
            if (col < m && matrix[row][col + 1] > matrix[row][col]) {
                count = Math.max(count, move(row, col + 1, n, m, matrix, memory) + 1);
            }
            // move up
            if (row > 0 && matrix[row - 1][col] > matrix[row][col]) {
                count = Math.max(count, move(row - 1, col, n, m, matrix, memory) + 1);
            }
            // move left
            if (col > 0 && matrix[row][col - 1] > matrix[row][col]) {
                count = Math.max(count, move(row, col - 1, n, m, matrix, memory) + 1);
            }
            memory[row][col] = count;
        }
        return memory[row][col];
    }
}
